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
public class Persona1 {
    // Atributos
    private String nombre;
    private int edad;
    private char genero;

    // Constructor
    public Persona1(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Método con parámetros
    public void celebrarCumpleanios(int anosCumpleanios) {
        edad += anosCumpleanios;
        System.out.println("¡Feliz cumpleaños! Ahora " + nombre + " tiene " + edad + " años.");
    }

    public void cambiarGenero(char nuevoGenero) {
        genero = nuevoGenero;
        System.out.println(nombre + " ahora se identifica como " + (genero == 'M' ? "masculino" : "femenino") + ".");
    }
}