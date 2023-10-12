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
public class Alumno_26 extends Persona_26 {
    private String nivel;

    public Alumno_26(String nombre, int edad, String nivel) {
        super(nombre, edad);
        this.nivel = nivel;
    }

    public void aprender() {
        System.out.println("Estoy aprendiendo en el nivel " + nivel);
    }
}

