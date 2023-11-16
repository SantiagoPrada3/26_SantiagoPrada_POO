/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_santiagoprada_s15;

/**
 *
 * @author Usuario
 */
public class fruta_26 {
    String nombre;
    String color;
    boolean esCitrico;
    double peso;
    boolean madura;

    public void setPeso(double peso) {
        // Método para establecer el peso de la fruta
        this.peso = peso;
    }

    public void mostrarInformacion() {
        // Método para mostrar información de la fruta
    }

    public boolean esCitrico() {
        // Método para verificar si la fruta es cítrica
        return esCitrico;
    }

    public void madurar() {
        // Método para hacer que la fruta madure
        madura = true;
    }

    public boolean estaMadura() {
        return madura;
    }
}



