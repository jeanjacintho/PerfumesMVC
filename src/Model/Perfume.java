package Model;

public class Perfume {
    private int id;
    private String nome;
    private double preco;
    private String sexoPerfume;
    private Fabricante fabricante;
    private String tipo_fragancia;
    private String notas;

    private static int count_id;

    public Perfume(String nome, double preco, String sexo_perfume, Fabricante fabricante, String tipo_fragancia, String notas) {
        count_id++;
        this.id = count_id;
        this.nome = nome;
        this.preco = preco;
        this.sexoPerfume = sexo_perfume;
        this.fabricante = fabricante;
        this.tipo_fragancia = tipo_fragancia;
        this.notas = notas;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSexoPerfume() {
        return sexoPerfume;
    }

    public void setSexoPerfume(String sexoPerfume) {
        this.sexoPerfume = sexoPerfume;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo_fragancia() {
        return tipo_fragancia;
    }

    public void setTipo_fragancia(String tipo_fragancia) {
        this.tipo_fragancia = tipo_fragancia;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.nome + " - " + this.preco + " - " + this.sexoPerfume + " - " + this.fabricante.getNome() + " - " + this.tipo_fragancia + " - " + this.notas;
    }

}
