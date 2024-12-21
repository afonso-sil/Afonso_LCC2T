package projecto.models;

public class Distribuidora {
    private int id;
    private String nome;
    private String nif;
    private String telefone;
    private String tipo_produto;

    public Distribuidora(int id, String nome, String nif, String telefone, String tipo_produto){
        this.id = id;
        this.nome = nome;
        this.nif = nif;
        this.telefone = telefone;
        this.tipo_produto = tipo_produto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }
}
