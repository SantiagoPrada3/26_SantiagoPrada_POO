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
public class S07v2_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos
        persona persona1 = new persona("Juan", 25, 'M');
        persona persona2 = new persona("Maria", 30, 'F');

        //uso
        persona1.saludar();
        System.out.println(persona1.nombre + " tiene " + persona1.calcularEdadEn2050() + " años en 2050.");
        persona1.mostrarInformacion();
        System.out.println("¿Es " + persona1.nombre + " mayor de edad? " + persona1.esMayorDeEdad());

        persona2.saludarOtraPersona(persona1);
        persona2.actualizarInformacion(32, 'F');
        persona2.mostrarInformacion("Trabajadora y activa en la comunidad.");
    }
}
    
