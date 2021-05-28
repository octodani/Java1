/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class primeraClaseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaración de variables
        double expre; // Declaración de la variable de tipo double.
        int a = 4, b = 6, c = 2; // Declaración e inicialización de las variables enteras.
        boolean variableBooleana = true; // Declaración e inicialización de la variable booleana.
        String nombre = "Daniel Miranda Torres"; // Declaración e inicialización de la variable String.
        
        // Impresión por pantalla del contenido de las variables.
        System.out.println("El valor de a es: " + a); // Impresión por pantalla del contenido de la variable "a".
        System.out.println("El valor de b es: " + b); // Impresión por pantalla del contenido de la variable "b".
        System.out.println("El valor de c es: " + c); // Impresión por pantalla del contenido de la variable "c".
        System.out.println("El valor de variableBooleana es: " + variableBooleana);  // Impresión por pantalla del contenido de la variable "variableBooleana".
        System.out.println("El valor de nombre es: " + nombre); // Impresión por pantalla del contenido de la variable "nombre".
        
        // Creación de la expresión e impresion por pantalla.
        expre = a + b / c + 1; // Inicialización de la variable "expre".
        System.out.println("El valor de expre es: " + expre); // Impresión por pantalla del contenido de la variable "expre".
        
        // Modificación de la expresión e impresión por pantalla.
        expre = (a + b) / c + 1; // Reasignación de la variable "expre".
        System.out.println("El valor de expre con paréntesis es: " + expre); // Impresión por pantalla del contenido modificado de la variable "expre".
        
        // Modificación de la variable "nombre" e impresión por pantalla.
        nombre = "26819001N"; // Reasignación de la variable "nombre
        System.out.println("El valor de nombre modificado es: " + nombre); // Impresión por pantalla del contenido modificado de la variable "nombre".
    }
    
}
