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
public class S11_26_E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante_26 estudiante = new Estudiante_26("Juan", 20, "Informática");
        estudiante.saludar();
        estudiante.imprimirEdad();
        estudiante.estudiar();

        Empleado_26 empleado = new Empleado_26("Ana", 30, "Gerente de Proyectos");
        empleado.saludar();
        empleado.imprimirEdad();
        empleado.trabajar();

        Alumno_26 alumno = new Alumno_26("Pedro", 25, "Bachillerato");
        alumno.saludar();
        alumno.imprimirEdad();
        alumno.aprender();
    }
    
    
}
