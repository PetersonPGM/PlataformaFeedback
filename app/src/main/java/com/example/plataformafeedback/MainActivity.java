package com.example.plataformafeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = (Button)findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                final TextView lbl = (TextView)findViewById(R.id.lblNome);
                final EditText textoNome = (EditText)findViewById(R.id.textoNome);
                String nome = textoNome.getText().toString();
                lbl.setText(nome);

                final TextView lbl1 = (TextView)findViewById(R.id.lblGestor);
                final EditText textoGestor = (EditText)findViewById(R.id.textoGestor);
                String gestor = textoGestor.getText().toString();
                lbl1.setText(gestor);

                final TextView lbl2 = (TextView)findViewById(R.id.lblRegistro);
                final EditText textoRegistro = (EditText)findViewById(R.id.textoRegistro);
                String registro = textoRegistro.getText().toString();
                lbl2.setText(registro);

                final TextView lbl3 = (TextView)findViewById(R.id.lblFeedback);
                final EditText textoFeedback = (EditText)findViewById(R.id.textoFeedback);
                String feedback = textoFeedback.getText().toString();
                lbl3.setText(feedback);
            }
        });
    }
}
