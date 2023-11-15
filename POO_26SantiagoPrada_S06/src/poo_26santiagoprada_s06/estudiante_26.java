/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_26santiagoprada_s06;

/**
 *
 * @author Usuario
 */
public class estudiante_26 {
    // Atributos
    private String nombre;
    private int edad;

    // Metodos
    public estudiante_26() {
        this.nombre = "Santiago";
        this.edad = 19;
    }

    // Constructor con parámetros (sobrecarga de constructores)
    public estudiante_26(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos con valores de retorno
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    // Método con valor de retorno (void)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + obtenerNombre());
        System.out.println("Edad: " + obtenerEdad());
    }

    // Método sobrecargado (sobrecarga de métodos)
    public void mostrarInformacion(boolean incluirDetalles) {
        if (incluirDetalles) {
            System.out.println("Detalles:");
            mostrarInformacion();
        } else {
            System.out.println("Nombre: " + obtenerNombre());
        }
        
    }
    
 }


