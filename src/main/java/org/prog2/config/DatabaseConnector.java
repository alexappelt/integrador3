package config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class DatabaseConnector {

    private static MongoDatabase mongoDatabase;

    private static final String DATABASE = "integrador3";

    public static MongoDatabase getDatabase(){
        if(mongoDatabase == null){
            CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                    fromProviders(PojoCodecProvider.builder().automatic(true).build()));

            MongoClientSettings mongoClientSettings = MongoClientSettings
                    .builder()
                    .applyConnectionString(new ConnectionString("mongodb://localhost:27017"))
                    .codecRegistry(pojoCodecRegistry)
                    .build();

            mongoDatabase = MongoClients.create(mongoClientSettings).getDatabase(DATABASE);
        }
        System.out.println("Conectado com sucesso!");
        return mongoDatabase;
    }

}
