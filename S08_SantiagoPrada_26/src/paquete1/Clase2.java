/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.Clase3;
import paquete2.Clase4;
import paquete3.Clase5;
import paquete3.Clase6;

/**
 *
 * @author Usuario
 */
public class Clase2 {
     public static void main(String[] args) {
      Clase1 clas = new Clase1();
      Clase3 clas2 = new Clase3();
      Clase4 clas3 = new Clase4();
      Clase5 clas5 = new Clase5();
      Clase6 clas4 = new Clase6();
      
     int z = clas.b = 12;
     String b = clas2.b = "Hola";
     String s = clas3.b = "Santiago";
     int e = clas4.c = 1;
     float f = clas5.b = 2f;
      
        System.out.println(z);
        System.out.println(b);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
    }
}
