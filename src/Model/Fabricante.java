package Model;

public class Fabricante {
    private int id;
    private String nome;
    private static int count_id;

    public Fabricante(String nome) {
        count_id++;
        this.id = count_id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.nome;
    }
}
