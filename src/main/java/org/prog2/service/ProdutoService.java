package org.prog2.service;

import org.prog2.dao.ProdutoDao;
import org.prog2.model.Produto;

public class ProdutoService {




    public String getQntdProd(){
        ProdutoDao objprod = new ProdutoDao();
        String quantidade = Long.toString(objprod.getQntdProduto());
        return quantidade;
    }

    public void inserirProduto(Produto objProduto){

        ProdutoDao produtoDao = new ProdutoDao();

        produtoDao.inserirProduto(objProduto);




    }


}
