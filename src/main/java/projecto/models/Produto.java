package projecto.models;

public class Produto {
    private int id;
    private String nome_produto;
    private String categoria;
    private double preco;

    public Produto(int id, String nome_produto, String categoria, double preco){
        this.id = id;
        this.nome_produto = nome_produto;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
