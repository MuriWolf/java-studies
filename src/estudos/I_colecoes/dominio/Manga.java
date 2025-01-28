package estudos.I_colecoes.dominio;

import java.util.Objects;


public class Manga implements Comparable<Manga> {
    private Long id;
    private String titulo;
    private Double valor;

    public Manga(long id, String titulo, Double valor) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Manga outroManga) {
        return this.id.compareTo(outroManga.getId());
    }
}
