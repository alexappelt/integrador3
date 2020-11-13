package org.prog2.controller;

import com.mongodb.client.FindIterable;
import org.prog2.dao.FilialDao;
import org.prog2.dao.ProdutoDao;
import org.prog2.model.Filial;
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

public class ListarFilialController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Filial> filiais = new ArrayList<>();
        FilialDao filialDao = new FilialDao();
        FindIterable<Filial> filiais2 = filialDao.getFilial();

        filiais2.forEach(a -> {
            filiais.add(a);
        });

        req.setAttribute("filiais", filiais);

        RequestDispatcher view = req.getRequestDispatcher("/view/filial/lista.jsp");
        view.forward(req, resp);
    }
}