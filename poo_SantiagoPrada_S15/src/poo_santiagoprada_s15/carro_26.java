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
public class carro_26 {
    String marca;
    String modelo;
    int anio;
    boolean encendido;
    double velocidadActual;

    public void encender() {
        // Método para encender el carro
    }

    public void apagar() {
        // Método para apagar el carro
    }

    public String obtenerMarcaModelo() {
        // Método para obtener la marca y modelo del carro
        return "Marca: " + marca + ", Modelo: " + modelo;
    }

    public int obtenerAnio() {
        // Método para obtener el año del carro
        return anio;
    }

    public void acelerar(double velocidad) {
        // Método para acelerar el carro
        velocidadActual += velocidad;
    }

    public void frenar() {
        // Método para frenar el carro
        velocidadActual = 0.0;
    }
}