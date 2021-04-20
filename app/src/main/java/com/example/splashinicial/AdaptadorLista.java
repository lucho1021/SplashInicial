package com.example.splashinicial;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder> {

    ArrayList<ComidasColombianas> listaDeDatos;

    public AdaptadorLista(ArrayList<ComidasColombianas> listaDeDatos) {
        this.listaDeDatos = listaDeDatos;
    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaItemListado = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_de_lista, null, false);
        return new viewHolder(vistaItemListado);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {
         holder.actualizarDatosDelItem(listaDeDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tipodeComida;
        ImageView fotoComida;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tipodeComida=itemView.findViewById(R.id.tipodeComida);
            fotoComida=itemView.findViewById(R.id.fotoComida);


        }

        public void actualizarDatosDelItem(ComidasColombianas datos) {

            tipodeComida.setText(datos.getTipodeComida());
            fotoComida.setImageResource(datos.getFotoComida());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(),comidasSeleccionadas.class);
                    intent.putExtra("Comidas Colombianas", datos);
                    itemView.getContext().startActivity(intent);

                }
            });

        }
    }
}