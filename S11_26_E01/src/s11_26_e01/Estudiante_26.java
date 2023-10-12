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
public class Estudiante_26 extends Persona_26 {
    private final String curso;

    public Estudiante_26(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    void estudiar() {
        System.out.println("Estoy estudiando el curso de " + curso);
    }
}