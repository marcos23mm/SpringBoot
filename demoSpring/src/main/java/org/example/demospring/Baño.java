package org.example.demospring;

import org.springframework.stereotype.Component;

@Component
public class Baño {

    private String tipo;
    private double tamaño;


    public Baño() {
        this.tipo = "Completo";
        this.tamaño = 5.0;
    }


    public Baño(String tipo, double tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Baño{" +
                "tipo='" + tipo + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

}
