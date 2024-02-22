/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_asignatura;

import java.util.Scanner; //Es un paquete de Java, las clases se guardan ahi.

/**
 *
 * @author invitado
 */
public class EVA1_6_ASIGNATURA {//CLASE.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLAVE, NOMBRE, CREDITOS,Hrt, Hrpr, carrera, tipoMat
        String clave, nombre, carrera;
        int creditos, horasT, horasP;
        boolean tipoMat;
        
             //CAPTURAR --> Scanner "captura"
        
    Scanner captura = new Scanner(System.in); //Es una variable  
    System.out.println("Introduce la clave de la asignatura: ");
     clave = captura.nextLine(); //Leer lo que escrbio el usuario hasta que de enter.
    System.out.println("Introduce el nombre de la asigantura ");
     nombre = captura.nextLine();
    System.out.println("Introduce la carrera de la asignatura: ");
     carrera = captura.nextLine();
    System.out.println("Introduce los créditos: ");
     creditos = captura.nextInt();
   System.out.println("Introduce las horas teóricas de la asignatura: ");
     horasT = captura.nextInt();
   System.out.println("Introduce las horas practicas de la asignatura: ");
     horasP = captura.nextInt();
   System.out.println("Introduce el tipo de la asigantura [TRUE --> GENÉRICA, FALSE --> ESPECIALIDAD]: ");
     tipoMat = captura.nextBoolean ();
     
     //HACER ALGO CON LOS TIPOS CAPTURADOS
     System.out. println(clave);
     System.out. println(nombre);
     System.out. println(carrera);
     System.out. println(creditos);
     System.out. println(horasT);
     System.out. println(horasP);
     System.out. println(tipoMat);
     
    }
    
}
