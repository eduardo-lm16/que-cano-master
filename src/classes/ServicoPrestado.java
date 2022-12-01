package classes;

public class ServicoPrestado {
    private int id;
    private int cnpjId;
    private int prestadorServicoId;
    private int quantidadeHoras;
    private String servicoPrestado;
    private String observacoes;
    private String descricaoServico;
    
    public void limpaDados(){
        setId(0);
        setCnpjId(0);
        setPrestadorServicoId(0);
        setQuantidadeHoras(0);
        setObservacoes("");
        setDescricaoServico("");
    }

    public String getServicoPrestado() {
        return servicoPrestado;
    }

    public void setServicoPrestado(String servicoPrestado) {
        this.servicoPrestado = servicoPrestado;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCnpjId() {
        return cnpjId;
    }

    public void setCnpjId(int cnpjId) {
        this.cnpjId = cnpjId;
    }

    public int getPrestadorServicoId() {
        return prestadorServicoId;
    }

    public void setPrestadorServicoId(int prestadorServicoId) {
        this.prestadorServicoId = prestadorServicoId;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }
}
