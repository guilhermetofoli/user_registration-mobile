package com.tofoli.userregistrationapp;
//Importa as anotações e classes da bibilioteca Room e do Android
import android.content.Context; //Classe que representa o contexto da aplicação (Necessário para acessar recursos)
import androidx.room.Database; // Anotação para marcar a classe como um banco de dados Room
import androidx.room.RoomDatabase; //Classe base que representa o BD


/*
Anotação @Database define que a classe representa o banco de dados Room
Ela específica as entidades (tabelas) que o banco irá conter e a versão do BD
 */

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {
    //Instância única (singleton) do BD
    private static UserDatabase Instance;

    //Método abstrato que será implementado pela Room
    //Serve para acessar as operações do BD definidas na UserDao
    public abstract UserDao userDao();

    //Método que retorna a instância do BD
    //O uso do 'syncronized' garante que apenas uma thread possa acessar este método por vez, evitando que duas instâncias do BD sejam criadas acidentalmente
    public static synchronized UserDatabase getInstance(Context context){

    }
}
