package maratonajavaviradonojiraya.N_threads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return this.open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return this.emails.size();
        }
    }

    public void addMembersEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou email a lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checando se há emails");

        synchronized (this.emails) {
            while (this.emails.isEmpty()) {
                if (!this.isOpen()) return null;
                System.out.println(Thread.currentThread().getName() + " não há emails no momento. Entranto em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;

        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " notificando que não estamos mais pegando emails.");
        }
    }
}
