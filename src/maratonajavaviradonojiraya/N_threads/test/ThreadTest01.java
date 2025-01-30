package maratonajavaviradonojiraya.N_threads.test;

/*
    NOTAS AULA 220-221 - threads pt 01, 02, 03

    threads são trabalhadores que cuidam de realizar tarefas no computador.
    No Java existem o Deamon Threads e o User Threads. O primeiro servindo para tarefas auxiliares das User threads. O programa encerra
    quando não há mais nenhuma User Thread rodando, sendo elas as mais importantes, o Deamon Thread não tem essa priori-
    dade, e o programa pode finalizar mesmo com algumas delas rodando.

    Por padrão, a thread principal do Java chama-se main.

    No exemplo abaixo, fica claro que nós programadores, não temos muito controle sobre as threads, e que seu comporta-
    mento não é totalmente preditivo. A JVM irá decidir quando e como as threads vão funcionar.

    Prioridade e sleep das threads:
    Dar prioridade a uma thread não garantirá que ela rodará primeiro, é apenas um indicador e pode variar dependendendo
    da implementação da JVM (existe mais de uma).
    Colocar a thread para dormir é uma das poucas coisas que é garantido. Apenas a própria thread se por a dormir.
* */

class CustomThread implements Runnable {
    private char c;

    public CustomThread(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 50; i++) {
            System.out.print(c);
            if (i % 30 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(2000);

        Thread t1 = new Thread(new CustomThread('A'), "T1");
        Thread t2 = new Thread(new CustomThread('B'), "T2");
        Thread t3 = new Thread(new CustomThread('C'), "T3");
        Thread t4 = new Thread(new CustomThread('D'), "T4");

        t1.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
