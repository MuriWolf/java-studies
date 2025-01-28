package estudos.N_threads.test;

import estudos.N_threads.domain.Members;
import estudos.N_threads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread t1 = new Thread(new EmailDeliveryService(members), "theodor");
        Thread t2 = new Thread(new EmailDeliveryService(members), "thorin");
        t1.start();
        t2.start();

        while(true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
               members.close();
               break;
            }
            members.addMembersEmail(email);
        }
    }
}
