/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07v2_26;

/**
 *
 * @author Usuario
 */
public class persona {
    
    // Atributos
    String nombre;
    private int edad;
    private char genero;

    // Constructor
    public persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }

    public int calcularEdadEn2050() {
        return 2050 - (2023 - edad);
    }

    // Sobrecarga de métodos
    public void mostrarInformacion() {
        System.out.println("Información de " + nombre + ": Edad " + edad + ", Género " + genero);
    }

    public void mostrarInformacion(String extraInfo) {
        System.out.println("Información de " + nombre + ": " + extraInfo);
    }

    // Métodos con valores de retorno
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Métodos con parámetros y argumentos
    public void actualizarInformacion(int nuevaEdad, char nuevoGenero) {
        edad = nuevaEdad;
        genero = nuevoGenero;
    }
    
    
    public void saludarOtraPersona(persona otraPersona) {
        System.out.println("Hola " + otraPersona.nombre + ", soy " + nombre + ".");
    }

}