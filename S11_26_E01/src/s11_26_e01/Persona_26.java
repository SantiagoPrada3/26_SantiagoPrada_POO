/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_26_e01;

/**
 *
 * @author Santiago
 */
public class Persona_26 {
    private final String nombre;
    private final int edad;

    public Persona_26(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public void imprimirEdad() {
        System.out.println("Tengo " + edad + " años.");
    }
}

