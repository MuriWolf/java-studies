package maratonajavaviradonojiraya.H_serializacao.test;

import maratonajavaviradonojiraya.H_serializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Ana", "1234567");
//        serializar(aluno);
        deserializar();

    }

    public static void serializar(Aluno aluno) {
        Path arquivo = Paths.get("alunos.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(arquivo))) {
            oos.writeObject(aluno);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializar() {
        Path arquivo = Paths.get("alunos.ser");

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(arquivo))) {
            Aluno aluno = (Aluno) ois.readObject();

            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
