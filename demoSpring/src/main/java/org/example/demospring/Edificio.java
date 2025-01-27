package org.example.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Edificio {

    private String nombre;
    private String constructora;

    private final Apartamento apartamento;

    @Autowired
    public Edificio(Apartamento apartamento) {
        this.nombre = "Edificio Central";
        this.constructora = "Constructora XYZ";
        this.apartamento = apartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }


    @Override
    public String toString() {
        return "Edificio{" +
                "nombre='" + nombre + '\'' +
                ", constructora='" + constructora + '\'' +
                ", apartamento=" + apartamento +
                '}';
    }
}
