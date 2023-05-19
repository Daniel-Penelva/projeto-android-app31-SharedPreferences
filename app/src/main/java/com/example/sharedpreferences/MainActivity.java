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

        //SharedPreferences.Editor editor = sharedPreferences.edit();

        //editor.putString("nome", "Daniel Penelva");
        //editor.putInt("idade", 32);
        //editor.putBoolean("estado",false);
        //editor.apply();

        // Resgatando os dados do SharedPreferences
        String nome = sharedPreferences.getString("nome", "");
        int idade = sharedPreferences.getInt("idade", 0);
        boolean estado = sharedPreferences.getBoolean("estado", false);

        Log.i("meu log", "" + nome);
        Log.i("meu log", "" + Integer.toString(idade));
        Log.i("meu log", "" + Boolean.toString(estado));
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
*
* As linhas 27, 28 e 29 de código seguintes são usadas para recuperar os valores armazenados anteriormente no SharedPreferences.
*
* A linha 27: String nome = sharedPreferences.getString("nome", ""); recupera uma string associada à chave "nome"
* no SharedPreferences. Se não houver uma string armazenada com essa chave, o valor padrão fornecido ("") será retornado.
*
* A linha 28: int idade = sharedPreferences.getInt("idade", 0); recupera um valor inteiro associado à chave "idade". Se não houver um valor inteiro armazenado com essa chave, o valor padrão fornecido (0) será retornado.
*
* A linha 29: boolean estado = sharedPreferences.getBoolean("estado", false); recupera um valor booleano associado à
* chave "estado". Se não houver um valor booleano armazenado com essa chave, o valor padrão fornecido (false) será retornado.
*
* Em seguida, o script usa o Log para imprimir os valores recuperados. O Log é uma ferramenta de depuração no Android
* que permite registrar informações relevantes durante a execução do aplicativo. Neste caso, os valores são registrados
* usando Log.i(), que é usado para mensagens de informação. As mensagens são impressas no console de log do dispositivo.
*
* Essas linhas de código imprimirão o valor de nome, idade e estado no console de log, respectivamente.

O primeiro argumento de Log.i() é uma tag que identifica a origem da mensagem no log. Nesse caso, a tag é definida como
* "meu log". O segundo argumento é a mensagem propriamente dita, que é convertida para uma string usando o método toString().
* */
