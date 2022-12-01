package classes;

public class Empresa {
    public String cnpj;
    public String telefone;
    public String razaoSocial;
    public String inscricaoEstadual;
    public String endereco;
    public String email;
    
    public Empresa(){
        this.cnpj = "";
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void limpaCnpj () {
        this.setCnpj("");
        this.setTelefone("");
        this.setInscricaoEstadual("");
        this.setRazaoSocial("");
        this.setEndereco ("");
        this.setEmail("");
    }
}

