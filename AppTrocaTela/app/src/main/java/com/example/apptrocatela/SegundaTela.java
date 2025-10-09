package com.example.apptrocatela;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

public class SegundaTela extends AppCompatActivity {

    private Button botaoVoltarInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda_tela);

        inicializarBotoes();
        configurarEventos();
    }

    private void inicializarBotoes() {
        botaoVoltarInicio = findViewById(R.id.botaoVoltarInicio);
    }

    private void configurarEventos() {
        botaoVoltarInicio.setOnClickListener(v -> {
            Intent voltar = new Intent(SegundaTela.this, MainActivity.class);
            startActivity(voltar);
        });
    }
}