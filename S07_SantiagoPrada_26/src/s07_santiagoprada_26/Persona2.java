/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_santiagoprada_26;

/**
 *
 * @author Usuario
 */
public class Persona2 {
    // Atributos
    String nombre;
    private int edad;
    private char genero;

    // Constructor
    public Persona2(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos con valores de retorno para persona2
    public String obtenerInformacion() {
        return "Información de " + nombre + ": Edad " + edad + ", Género " + genero;
    }

    public boolean puedeVotar() {
        return edad >= 18;
    }
}
