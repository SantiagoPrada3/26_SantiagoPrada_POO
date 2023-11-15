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
public class S07_SantiagoPrada_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Crear objetos
        Persona1 persona1 = new Persona1("Juan", 25, 'M');
        Persona2 persona2 = new Persona2("Maria", 30, 'F');

        // Métodos  para persona1
        persona1.celebrarCumpleanios(1);
        persona1.cambiarGenero('O'); // Persona1 cambia su género a Otro

        // Métodos  para persona2
        System.out.println(persona2.obtenerInformacion());
        System.out.println("¿Puede " + persona2.nombre + " votar? " + (persona2.puedeVotar() ? "Sí" : "No"));
    }
}
