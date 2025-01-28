package estudos.N_threads.test;

/*
    NOTAS DA AULA 225 - Threads pt 06 - Sincronismo de Thread pt 02

    A forma de evitar o problema da aula anterior é usar os princípios sintetizados na sigla ATOMIC, onde, num pedaço de
    código, caso a thread entre nele, deve terminá-lo, não dando espaço para nenhuma outra nesse meio tempo, o que
    garantirá consistência de dados.

    O synchronized é o que irá realizar esse serviço aqui, pode ser aplicado ema função, classe (incomum) ou num objeto
    específico, dentro de um bloco. Importante notar de no caso de apenas um objeto ser synchronized, ele deve ser final,
    para que não haja conflitos.

    Esse arquivo é uma cópia do anterior, com apenas poucas alterações, por isso não pulei de 01 para 02.
* */

import estudos.N_threads.domain.Account;

public class ThreadAccountTest015 implements Runnable{
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest015 threadAccountTest01 = new ThreadAccountTest015();

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
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque. Valor atual da conta: " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque Valor. atual da conta: " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
