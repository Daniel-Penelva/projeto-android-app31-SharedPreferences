package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("nome", "Daniel Penelva");
        editor.putInt("idade", 32);
        editor.putBoolean("estado",false);
        editor.apply();
    }
}

/*
* SharedPreferences, que é uma classe no Android para armazenar pequenos conjuntos de dados-chave/valor de forma
* persistente.
*
* A primeira linha do script obtém uma instância do SharedPreferences padrão usando o método estático getDefaultSharedPreferences(this).
* O argumento this geralmente é uma referência a um contexto do Android, como uma Activity ou um Service, e é usado
* para identificar o arquivo de preferências associado a esse contexto específico.
*
* A segunda linha cria um editor de SharedPreferences chamado editor usando o método edit() do objeto SharedPreferences
* obtido anteriormente. O editor é usado para fazer alterações nos valores armazenados no SharedPreferences.
*
* Com o editor em mãos, você pode usar seus métodos para adicionar, remover ou atualizar valores no SharedPreferences.
* Por exemplo, você pode usar o método putString() para adicionar uma string ao SharedPreferences.
*
* Depois de fazer todas as alterações desejadas, você precisa aplicar essas alterações chamando o método apply() ou
* commit() do editor.
*
* O método apply() salva as alterações em segundo plano de forma assíncrona, enquanto o método commit() salva as
* alterações de forma síncrona, bloqueando a thread principal até que a operação seja concluída.
*
* É importante lembrar de chamar o método apply() ou commit() após fazer as alterações, caso contrário, as alterações não
* serão salvas no SharedPreferences.
* */
