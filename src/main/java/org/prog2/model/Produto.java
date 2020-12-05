package org.prog2.model;

public class Produto{



    private String codigo;
    private String descricao;
    private String valor;
    private String cozinha;
    private String qntdestoque;
    private String imagem;
    private String valototal;
    private String status;
    private String bootstrap;

    public String getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(String bootstrap) {
        this.bootstrap = bootstrap;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getValototal() {
        return valototal;
    }

    public void setValototal(String valototal) {
        this.valototal = valototal;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    private String quantidade;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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
