package org.prog2.controller;

import com.mongodb.client.FindIterable;
import org.prog2.dao.ProdutoDao;
import org.prog2.model.Produto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaProdutoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Produto> produtos = new ArrayList<>();
        ProdutoDao produtoDao = new ProdutoDao();
        FindIterable<Produto> products = produtoDao.getProduto();

        products.forEach(a -> {
            produtos.add(a);
        });

        req.setAttribute("produtos", produtos );

        RequestDispatcher view = req.getRequestDispatcher("/view/produto/lista.jsp");
        view.forward(req, resp);
    }
}