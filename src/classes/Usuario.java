
package classes;

public class Usuario {
    private int id;
    private String login;
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }
    
    public Usuario(){
        this.id = 0;
        this.login = "";
        this.senha = "";
    }
    
    public void limparUsuario (){
        this.setId(0);
        this.setLogin("");
        this.setSenha("");
    }
}
