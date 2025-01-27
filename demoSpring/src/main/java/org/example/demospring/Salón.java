package org.example.demospring;

import org.springframework.stereotype.Component;

@Component
public class Salón {
        private String estilo;
        private double tamaño;


    public Salón() {
        this.estilo = "Moderno";
        this.tamaño = 20.0;

    }


    public Salón(String estilo, double tamaño) {
        this.estilo = estilo;
        this.tamaño = tamaño;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Salón{" +
                "estilo='" + estilo + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}
