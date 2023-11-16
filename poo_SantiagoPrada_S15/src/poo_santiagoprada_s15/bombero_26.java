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
public class bombero_26 {
     String nombre;
    int edad;
    boolean esVoluntario;
    String estacionPerteneciente;
    int anosServicio;

    public void asignarEstacion(String estacion) {
        // Método para asignar una estación al bombero
        estacionPerteneciente = estacion;
    }

    public String obtenerEstacion() {
        // Método para obtener la estación del bombero
        return estacionPerteneciente;
    }

    public boolean esVoluntario() {
        // Método para verificar si el bombero es voluntario
        return esVoluntario;
    }

    public void cumplirAnios() {
        // Método para hacer que el bombero cumpla años
        edad++;
    }

    public void incrementarAnosServicio() {
        // Método para incrementar los años de servicio del bombero
        anosServicio++;
    }
}