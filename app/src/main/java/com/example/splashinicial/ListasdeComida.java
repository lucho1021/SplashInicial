package com.example.splashinicial;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class ListasdeComida extends AppCompatActivity {

    ArrayList<ComidasColombianas> listaDeDatos = new ArrayList<>();
    RecyclerView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasde_comida);

        listado=findViewById(R.id.listado);
        listado.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        crearListado();

        AdaptadorLista adaptador = new AdaptadorLista(listaDeDatos);
        listado.setAdapter(adaptador);


    }
    private void crearListado() {

        listaDeDatos.add(new ComidasColombianas(
                "Bandeja Paisa",
                getString(R.string.descripcionbandejapaisa),
                R.drawable.bandejapaisa
        ));

        listaDeDatos.add(new ComidasColombianas(
                "Mondongo",
                getString(R.string.descripcionmondongo),
                R.drawable.mondongo
        ));

    }
}