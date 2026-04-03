package com.tofoli.userregistrationapp;

// Importa anotações do Room necessários para mapear esta classe como uma entidade no banco de dados//
import androidx.room.Entity;
import androidx.room.PrimaryKey;
public class User {

    //Define o campo 'id' como chave primária da tabela e conifugra pra ser gerado automaticamente
    @PrimaryKey(autoGenerate = true)
    private int id;

    //Campos que representam as colunas da tabela para armazenar os dados do usuário//
    private String name; //Nome do Usuário
    private String cpf; //CPF do Usuário
    private String email; //Email do Usuário
    private String phone; //Fone do Usuário
}
