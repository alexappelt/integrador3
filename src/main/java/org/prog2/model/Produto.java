package org.prog2.model;

public class Produto{


    private String descricao;
    private String valor;
    private String cozinha;
    private String qntdestoque;
    private String imagem;


    public void setImagem(String imagem){
        this.imagem = imagem;
    }

    public String getImagem(){
        return imagem;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCozinha() {
        return cozinha;
    }

    public void setCozinha(String cozinha) {
        this.cozinha = cozinha;
    }

    public String getQntdestoque() {
        return qntdestoque;
    }

    public void setQntdestoque(String qntdestoque) {
        this.qntdestoque = qntdestoque;
    }

}
