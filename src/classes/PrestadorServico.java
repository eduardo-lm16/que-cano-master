package classes;

import java.sql.Date;

public class PrestadorServico {
    public int numeroMatricula;
    public String pis;
    public int numeroFilhos;
    public double salario;
    public int cargaHoraria;
    public String nome;
    public String dataAdmissao;
    public String cpf;
    public String rg;
    public int sexoId;
    public int estadoCivilId;
    public int cargoId;
    public String endereco;
    public String dataNasc;

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public void setNumeroFilhos(int numeroFilhos) {
        this.numeroFilhos = numeroFilhos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getSexoId() {
        return sexoId;
    }

    public void setSexoId(int sexoId) {
        this.sexoId = sexoId;
    }

    public int getEstadoCivilId() {
        return estadoCivilId;
    }

    public void setEstadoCivilId(int estadoCivilId) {
        this.estadoCivilId = estadoCivilId;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public PrestadorServico() {
        this.numeroMatricula = 0;
        this.pis = "";
        this.numeroFilhos = 0;
        this.salario = 0;
        this.cargaHoraria = 0;
        this.nome = "";
        this.dataAdmissao = null;
        this.cpf = "";
        this.rg = "";
        this.sexoId = 0;
        this.estadoCivilId = 0;
        this.cargoId = 0;
        this.endereco = "";
        this.dataNasc = null;
    }
    
    public void limpaFuncionario() {
        this.setNumeroMatricula(0);
        this.setPis("");
        this.setNumeroFilhos(0);
        this.setSalario(0);
        this.setCargaHoraria(0);
        this.setNome("");
        this.setDataAdmissao(null);
        this.setCpf("");
        this.setRg("");
        this.setSexoId(0);
        this.setEstadoCivilId(0);
        this.setCargoId(0);
        this.setEndereco("");
        this.setDataNasc(null);
    }
    
}
