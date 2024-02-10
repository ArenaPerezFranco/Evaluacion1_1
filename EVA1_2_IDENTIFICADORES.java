/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_identificadores;

/**
 *
 * @author invitado
 */
public class EVA1_2_IDENTIFICADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            //VARIABLES:
        //TIPO DE DATO NOMBRE DEL IDENTIFICADOR}
        //short int byte long --> Enteros
        //float double --> Numeros con decimal
        //char--> character --> Caracteres
        //boolean --> verdadero o falso
        //String --> Cadenas de texto 
        //si NO se declara una variable, NO se puede usar
        
        int Edad; //Declaración de una variable
        String Nombre; //No palabra reservada
        double Salario;
        
        //ASIGNACIÓN DE VALORES:
        //IDENTIFICADOR = VALOR;
        //Se coloca el valor 50 dentro de la variable edad.
        
        Edad=50;
        Nombre = "Juan Perez Jolote"; 
        //Se usa "" para que sea un texto si no luego piensa que es una variable.
        Salario = 123.56;
        //COMO LOS USAMOS:
        System.out.println(Nombre);
        System.out.println(Edad);
        System.out.println(Salario);
        
    }
    
}
