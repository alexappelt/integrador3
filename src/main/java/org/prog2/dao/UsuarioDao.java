package org.prog2.dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.prog2.model.Usuario;


public class UsuarioDao {


    public void inserirUsuario(Usuario objUsuario){

        getCollection().insertOne(objUsuario);

    }

    public FindIterable<Usuario> getUsuario(){
        return  getCollection().find();
    }

    private MongoCollection<Usuario> getCollection(){
        return config.DatabaseConnector.getDatabase().getCollection("usuario", Usuario.class);
    }



}
