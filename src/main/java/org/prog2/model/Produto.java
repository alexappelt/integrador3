package org.prog2.model;

public class Produto {


    private String descricao;
    private Double valor;
    private Boolean cozinha;
    private Integer qntd_estoque;



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getCozinha() {
        return cozinha;
    }

    public void setCozinha(Boolean cozinha) {
        this.cozinha = cozinha;
    }

    public Integer getQntd_estoque() {
        return qntd_estoque;
    }

    public void setQntd_estoque(Integer qntd_estoque) {
        this.qntd_estoque = qntd_estoque;
    }

}
