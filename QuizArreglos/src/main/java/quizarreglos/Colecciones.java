/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizarreglos;

/**
 *
 * @author steve-urbit
 */
public class Colecciones {
    public static char[] apilar(char[] palabraOriginal,char letra){
        char[] miArreglo = new char [palabraOriginal.length+1];
        for (int i = 0; i < palabraOriginal.length; i++) {
            miArreglo[i]=palabraOriginal[i];
            
        }
        for (int i = 0; i < palabraOriginal.length+1; i++) {
          miArreglo[palabraOriginal.length]=letra;  
                
            }
        
        return miArreglo;
    }
    public static char[] desapilar(char[] palabraOriginal){
        char[] arreglo = new char [palabraOriginal.length-1];
        for (int i = 0; i < palabraOriginal.length-1; i++) {
           arreglo[i]=palabraOriginal[i];
            
        }
          return null;
        
        
    }
    public static char[] encolar(char[] palabraOriginal,char letra){
        return null;
    }
    public static char[] desencolar(char[] palabraOriginal){
        return null;
    }
}
    

