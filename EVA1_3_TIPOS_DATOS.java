/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_tipos_datos;

/**
 *
 * @author invitado
 */
public class EVA1_3_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte pruebaByte; // 1 byte = 8 bits -> 256
        //pruebaByte = 256; //256 NO cabe en la variable
        pruebaByte = -127;
        pruebaByte = 127;
        pruebaByte = -128; //Acepta de -128 a 127
        
        short pruebaShort; //2 bytes = 16 bits
         //pruebaShort = -32,769; NO cabe    
         pruebaShort = -32768;
         pruebaShort = 32767;
        System.out.println(pruebaShort); //imprime la variable pruebaShort
        pruebaShort++; // ++ --> OPERADOR, suma uno al contenido de la variable
        System.out.println(pruebaShort);
    }
    
}
