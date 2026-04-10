package com.tofoli.userregistrationapp;
//Importa as anotações e classes da bibilioteca Room e do Android
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
}
