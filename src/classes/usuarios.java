package classes;

public class usuarios {
    private String login;
    private String email;
    private String senha;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
    public usuarios(){
    this.login = "";
    this.email = "";
    this.senha = "";
    
}
public void limparUsuario (){
    this.setLogin ("");
    this.setEmail ("");
    this.setSenha("");
}
}
