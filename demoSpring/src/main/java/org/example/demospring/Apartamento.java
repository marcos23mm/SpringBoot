package org.example.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Apartamento {

    private String piso;
    private final Baño baño;
    private final Salón salon;

    @Autowired
    public Apartamento(Baño baño, Salón salon) {
        this.baño = baño;
        this.salon = salon;
    }

    // Constructor adicional
    public Apartamento(String piso, Baño baño, Salón salon) {
        this.piso = piso;
        this.baño = baño;
        this.salon = salon;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Baño getBaño() {
        return baño;
    }

    public Salón getSalon() {
        return salon;
    }


    @Override
    public String toString() {
        return "Apartamento{" +
                "piso='" + piso + '\'' +
                ", baño=" + baño +
                ", salon=" + salon +
                '}';
    }
}
