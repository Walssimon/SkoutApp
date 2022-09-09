package br.com.etecia.skoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsuario, edtSenha;
    Button btnEntrar, btnSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsuario = findViewById(R.id.email);
        edtSenha = findViewById(R.id.senha);
        btnEntrar = findViewById(R.id.entrar);
        btnSair = findViewById(R.id.sair);


        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    btnEntrar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String usuario,senha;
            usuario = edtUsuario.getText().toString();
            senha = edtSenha.getText().toString();

            Toast.makeText(getApplicationContext(),"Vou entrar, espera!",Toast.LENGTH_SHORT).show();
        }
    });
    }

}