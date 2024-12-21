package projecto.models;

public class Usuario {

    private int id;
    private String nome_completo;
    private String email;
    private String senha;


    public Usuario(int id, String nome_completo, String email, String senha ){
        this.id = id;
        this.nome_completo = nome_completo;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
