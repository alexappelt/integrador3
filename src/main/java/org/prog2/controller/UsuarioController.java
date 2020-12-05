package org.prog2.controller;

import com.mongodb.client.FindIterable;
import org.prog2.dao.FilialDao;
import org.prog2.model.Filial;
import org.prog2.model.Usuario;
import org.prog2.service.UsuarioService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController extends HttpServlet {

    UsuarioService usuarioService = new UsuarioService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        List<Filial> filiais = new ArrayList<>();

        FilialDao filialDao = new FilialDao();
        FindIterable<Filial> filiais2 = filialDao.getFilial();


        filiais2.forEach(a -> {
            filiais.add(a);
        });

        req.setAttribute("filiais", filiais);

        RequestDispatcher view = req.getRequestDispatcher("/view/usuario/index.jsp");
        view.forward(req, resp);
    }




    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Usuario objUsuario = new Usuario();

        objUsuario.setLogin(req.getParameter("login"));
        objUsuario.setSenha(req.getParameter("senha"));
        objUsuario.setPerfil(req.getParameter("perfil"));



        usuarioService.inserirUsuario(objUsuario);

        resp.sendRedirect("/listarusuario");


    }

}
