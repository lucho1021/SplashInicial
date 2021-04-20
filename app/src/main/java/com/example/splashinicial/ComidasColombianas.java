package com.example.splashinicial;

import java.io.Serializable;

public class ComidasColombianas implements Serializable {

    String tipodeComida, descripcionComida;
    int fotoComida;

    public ComidasColombianas(String tipodeComida, String descripcionComida, int fotoComida) {
        this.tipodeComida = tipodeComida;
        this.descripcionComida = descripcionComida;
        this.fotoComida = fotoComida;
    }

    public String getTipodeComida() {
        return tipodeComida;
    }

    public void setTipodeComida(String tipodeComida) {
        this.tipodeComida = tipodeComida;
    }

    public String getDescripcionComida() {
        return descripcionComida;
    }

    public void setDescripcionComida(String descripcionComida) {
        this.descripcionComida = descripcionComida;
    }

    public int getFotoComida() {
        return fotoComida;
    }

    public void setFotoComida(int fotoComida) {
        this.fotoComida = fotoComida;
    }
}







