package estudos.N_threads.test;

import java.util.ArrayList;
import java.util.List;

/*
    NOTAS DA AULA 226 - Threads pt 07 - Sincronismo de Threads pt 03 - Classes Thread Safe

    Mesmo utilizando class com métodos sincronizados, caso por cima disso, esteja usando métodos que não são, os
    problemas podem persistir igualmente. É importante prestar atenção nisso.

    Nota: O erro esperado não acontecia quando não tinha a linha 13, que printa o nome da thread.
* */

class ThreadSafeNames {
//    private final List<String> list = Collections.synchronizedList(new ArrayList<>());
    private final List<String> list = new ArrayList<>();

    public synchronized  void add(String name) {
        list.add(name);
    }

    public synchronized void removeFirst() {
        if (list.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(list.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Shelley");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
