package classes;

public class Funcionario {
    public int numero_matricula;
    public int pis;
    public int numero_filhos;
    public double salario;
    public int carga_horario;
    public String nome;
    public String data_admissao;
    public String cpf;
    public String rg;
    public String sexo;
    public String cidade;
    public String estado;
    public String estado_civil;
    public String cargo;
    public String endereco;
    public String data_nascimento;

    public void setNumero_matricula(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public void setNumero_filhos(int numero_filhos) {
        this.numero_filhos = numero_filhos;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCarga_horario(int carga_horario) {
        this.carga_horario = carga_horario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int getNumero_matricula() {
        return numero_matricula;
    }

    public int getPis() {
        return pis;
    }

    public int getNumero_filhos() {
        return numero_filhos;
    }

    public double getSalario() {
        return salario;
    }

    public int getCarga_horario() {
        return carga_horario;
    }

    public String getNome() {
        return nome;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }
    
    public Funcionario() {
    this.numero_matricula = 0;
    this.pis = 0;
    this.numero_filhos = 0;
    this.salario = 0;
    this.carga_horario = 0;
    this.nome = "";
    this.data_admissao = "";
    this.cpf = "";
    this.rg = "";
    this.sexo = "";
    this.cidade = "";
    this.estado = "";
    this.estado_civil = "";
    this.cargo = "";
    this.endereco = "";
    this.data_nascimento = "";
}
    public void limpaFuncionario () {
        this.setNumero_matricula (0);
        this.setPis (0);
        this.setNumero_filhos (0);
        this.setSalario (0);
        this.setCarga_horario (0);
        this.setNome ("");
        this.setData_admissao ("");
        this.setCpf ("");
        this.setRg ("");
        this.setSexo ("");
        this.setCidade ("");
        this.setEstado ("");
        this.setEstado_civil ("");
        this.setCargo ("");
        this.setEndereco ("");
        this.setData_nascimento ("");
    }
    
}
