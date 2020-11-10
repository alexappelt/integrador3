package org.prog2.dao;

import com.mongodb.client.MongoCollection;
import org.prog2.model.Produto;

import java.util.Collection;

public class ProdutoDao {


    public void inserirFilial(Produto objProduto){

    getCollection().insertOne(objProduto);

    }


    private MongoCollection<Produto> getCollection(){
        return config.DatabaseConnector.getDatabase().getCollection("produto", Produto.class);
    }

}
