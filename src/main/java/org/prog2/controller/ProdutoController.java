package org.prog2.controller;

import org.prog2.dao.ProdutoDao;
import org.prog2.model.Produto;
import org.prog2.service.ProdutoService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

        objProduto.setDescricao(req.getParameter("descricao"));

        produtoService.inserirProduto(objProduto);

        resp.sendRedirect("/listarprodutos");

    }
}
