package com.tofoli.userregistrationapp;

//Importações de componentes de UI, Intenções e biblioteca room
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class ReportActivity extends AppCompatActivity {
    //Campo de texto onde os dados do banco serão exibidos
    private TextView textViewReport;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Define o layout XML dessa tela de relatório
        setContentView(R.layout.activity_report);
        //Mapeamento do TextView do XML para o java
        textViewReport = findViewById(R.id.textViewReport);
        //Encontra o botão e define o clique para voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        //O botão de retorno utilizando expressão lambda
        btnVoltar.setOnClickListener(v -> voltarParaCadastro());

        /*
        Conexão com o banco de dados
        1 - Cria uma instância do Banco "user-database"
        2 - .allowMainThreadQueries(): Serve para liberar operações de consulta feitas em threads da UI.
        Por padrão, ROOM proibe isso. o correto seria fazer consultas em threads separadas;
         */

        UserDatabase db = Room.databaseBuilder(getApplication(),UserDatabase.class, "user-database"). allowMainThreadQueries().build();

    }


    // Método resposnável pela navegação entre as telas do app
    public void voltarParaCadastro(){
        //Intenção para abrir a tela de cadastro
        Intent intent = new Intent(ReportActivity.this, MainActivity.class);
        startActivity(intent);
        //Fecha a tela de relatório para não acumular na pilha de tarefas
        finish();
    }
}
