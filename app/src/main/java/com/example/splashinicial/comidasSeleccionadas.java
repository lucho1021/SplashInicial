package com.example.splashinicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class comidasSeleccionadas extends AppCompatActivity {

    TextView tipodeComida, descripcionComida;
    ImageView fotoComida;

    ComidasColombianas comidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comidas_seleccionadas);

        tipodeComida=findViewById(R.id.tipodeComida);
        descripcionComida=findViewById(R.id.descripcionComida);
        fotoComida=findViewById(R.id.fotoComida);

        comidas=(ComidasColombianas) getIntent().getSerializableExtra("Comidas Colombianas");

        tipodeComida.setText(comidas.getTipodeComida());
        descripcionComida.setText(comidas.getDescripcionComida());
        fotoComida.setImageResource(comidas.getFotoComida());

    }
}