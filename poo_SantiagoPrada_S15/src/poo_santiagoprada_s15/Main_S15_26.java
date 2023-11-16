/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_santiagoprada_s15;

/**
 *
 * @author Usuario
 */
public class Main_S15_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // uso de la clase Profesor_26
        profesor_26 profesor = new profesor_26();
        profesor.nombre = "Juan";
        profesor.edad = 40;
        profesor.especialidad = "Matemáticas";
        profesor.disponible = true;
        profesor.experiencia = 5;

        profesor.mostrarInformacion();
        System.out.println("Experiencia del profesor: " + profesor.obtenerExperiencia());
        profesor.incrementarExperiencia();
        System.out.println("Experiencia actualizada: " + profesor.obtenerExperiencia());

        //uso de la clase Carro_26
        carro_26 carro = new carro_26();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.anio = 2022;
        carro.encendido = false;
        carro.velocidadActual = 0.0;

        carro.encender();
        System.out.println("Información del carro: " + carro.obtenerMarcaModelo());
        carro.acelerar(30);
        System.out.println("Velocidad actual: " + carro.velocidadActual);

        // uso de la clase Fruta_26
        fruta_26 fruta = new fruta_26();
        fruta.nombre = "Manzana";
        fruta.color = "Rojo";
        fruta.esCitrico = false;
        fruta.peso = 0.2;
        fruta.madura = false;

        fruta.mostrarInformacion();
        fruta.madurar();
        System.out.println("¿Está madura? " + (fruta.estaMadura() ? "Sí" : "No"));

        //uso de la clase Bombero_26
        bombero_26 bombero = new bombero_26();
        bombero.nombre = "Ana";
        bombero.edad = 30;
        bombero.esVoluntario = true;
        bombero.estacionPerteneciente = "Estación 5";
        bombero.anosServicio = 3;

        bombero.asignarEstacion("Estación 7");
        System.out.println("Estación actual del bombero: " + bombero.obtenerEstacion());
        bombero.cumplirAnios();
        System.out.println("Edad del bombero: " + bombero.edad);
        bombero.incrementarAnosServicio();
        System.out.println("Años de servicio: " + bombero.anosServicio);
    }
}