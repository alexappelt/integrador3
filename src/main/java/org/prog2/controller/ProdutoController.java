package org.prog2.controller;

import org.prog2.dao.ProdutoDao;
import org.prog2.model.Produto;
import org.prog2.service.ProdutoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ProdutoController extends HttpServlet {

    private ProdutoService produtoService = new ProdutoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/view/produto/cadastro.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Produto objProduto = new Produto();

        ProdutoDao objprod = new ProdutoDao();

        objProduto.setCodigo(Long.toString(objprod.getQntdProduto()));
        objProduto.setDescricao(req.getParameter("descricao"));
        objProduto.setValor(req.getParameter("valor"));
        objProduto.setQntdestoque(req.getParameter("qntdestoque"));
        objProduto.setImagem(req.getParameter("imagem"));

        String cozinha = "";

        if (req.getParameter("cozinha") == null){
            cozinha = "Não" ;
        }else{
            cozinha = "Sim";
        }


        objProduto.setCozinha(cozinha);



        produtoService.inserirProduto(objProduto);

        resp.sendRedirect("/listarprodutos");

    }
}
