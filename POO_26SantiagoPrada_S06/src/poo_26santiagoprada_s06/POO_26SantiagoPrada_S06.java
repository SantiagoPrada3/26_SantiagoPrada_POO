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
public class POO_26SantiagoPrada_S06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Estudiante_00
        estudiante_26 estudiante1 = new estudiante_26();  // Llamada al constructor sin parámetros
        estudiante1.mostrarInformacion();

        estudiante_26 estudiante2 = new estudiante_26("Juan", 20);  // Llamada al constructor con parámetros
        estudiante2.mostrarInformacion();

        // Ejemplo de uso de la clase Calculadora_00
        calculadora_26 calculadora = new calculadora_26();

        int sumaEnteros = calculadora.sumar(5, 10);  // Llamada al método con parámetros y valor de retorno
        System.out.println("Suma de enteros: " + sumaEnteros);

        double sumaDobles = calculadora.sumar(2.5, 3.5);  // Llamada al método sobrecargado con parámetros y valor de retorno
        System.out.println("Suma de dobles: " + sumaDobles);

        int producto = calculadora.multiplicar(4, 7);  // Llamada al método con parámetros y valor de retorno
        System.out.println("Producto: " + producto);
    }
}
