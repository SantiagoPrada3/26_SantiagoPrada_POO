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
public class Empleado_26 extends Persona_26 {
    private final String puesto;
    
    public Empleado_26(String nombre, int edad, String puesto) {
        super(nombre, edad);
        this.puesto = puesto;
    }

    public void trabajar() {
        System.out.println("Soy un empleado y trabajo como " + puesto);
    }
}
