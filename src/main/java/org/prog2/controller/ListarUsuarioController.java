package org.prog2.controller;

import com.mongodb.client.FindIterable;
import org.prog2.dao.UsuarioDao;
import org.prog2.model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListarUsuarioController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Usuario> usuarios = new ArrayList<>();
        UsuarioDao usuarioDao = new UsuarioDao();
        FindIterable<Usuario> usuario2 = usuarioDao.getUsuario();

        usuario2.forEach(a -> {
            usuarios.add(a);

        });

        req.setAttribute("usuarios", usuarios);

        RequestDispatcher view = req.getRequestDispatcher("/view/usuario/lista.jsp");
        view.forward(req, resp);
    }
}