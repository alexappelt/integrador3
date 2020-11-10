package org.prog2.dao;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.prog2.model.Produto;

public class ProdutoDao {


    public void inserirFilial(Produto objProduto){

    getCollection().insertOne(objProduto);

    }

    public FindIterable<Produto> getProduto(){
       return  getCollection().find();
    }

    private MongoCollection<Produto> getCollection(){
        return config.DatabaseConnector.getDatabase().getCollection("produto", Produto.class);
    }

}
