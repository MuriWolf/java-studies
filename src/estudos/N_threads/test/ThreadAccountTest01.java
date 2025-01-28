package estudos.N_threads.test;

/*
    NOTAS DA AULA 224 - Threads pt 05 - Sincronismo de Thread pt 01

    Nesta aula foi apresentado uma situação onde duas threads estão realizando o mesmo trabalho, mais especificamente,
    lidando com o mesmo objeto, e os impactos que isso pode ter.
* */

import estudos.N_threads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();

        Thread t1 = new Thread(threadAccountTest01, "first worker");
        Thread t2 = new Thread(threadAccountTest01, "second worker");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
           withdrawal(10);
           if (account.getBalance() < 0) {
               System.out.println("WE ARE FUCKED UP!! Outra thread pode tentar sacar dinheiro onde não tem.");
               break;
           }
        }
    }

    private void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + "está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + "completou o saque. Valor atual da conta: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque Valor. atual da conta: " + account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
