package estudos.colecoes.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    public Long id;
    public String nome;

    public Consumidor(String nome) {
        this.id = ThreadLocalRandom.current().nextLong(1, 10000);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
