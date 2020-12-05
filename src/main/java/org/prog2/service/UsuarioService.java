package org.prog2.service;


import org.prog2.dao.UsuarioDao;
import org.prog2.model.Usuario;


public class UsuarioService {

    public void inserirUsuario(Usuario objUsuario){

        UsuarioDao usuarioDao = new UsuarioDao();

        usuarioDao.inserirUsuario(objUsuario);
        
    }
}
