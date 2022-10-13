package com.example.plataformafeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Infos(View view){
        TextView texto = findViewById(R.id.textoNome);
        findViewById(R.id.textoGestor);
        findViewById(R.id.textoRegistro);
        findViewById(R.id.textoFeedback);

        TextView textoNome = (TextView) findViewById(R.id.nome);
        TextView textoGestor = (TextView)findViewById(R.id.registro);
        TextView textoFeedback = (TextView)findViewById(R.id.gestor);
        TextView textoRegistro = (TextView)findViewById(R.id.feedback);
    }
}