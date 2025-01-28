package estudos.threads.test;

/*
    NOTAS AULA 223 threads pt 04

    Dois novos métodos relacionados às threads foram apresentados:
        - yield: Irá tentar dormir para dar chance à outras threads de mesma prioridade que estão paradas funcionar. O
        funcionamento não é garantido.
        - join(): Fará com que a thread seja executada até o final, impedindo com que outras sejam rodadas nesse meio
        tempo.
* */

class CustomThread2 implements Runnable {
    private char c;

    public CustomThread2(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 200; i++) {
            System.out.print(c);
            if (i % 30 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new CustomThread2('A'), "T1");
        Thread t2 = new Thread(new CustomThread2('B'), "T2");

        t1.start();
        t1.join();
        t2.start();
    }
}
