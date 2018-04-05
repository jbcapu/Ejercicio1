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
public class Ahorcado {
    
    public static char[] resultadoJugada(char[] palabraOriginal, char letra){
        
        char[] miArreglo= new char [palabraOriginal.length];
        
        for (int i = 0; i < palabraOriginal.length ; i++) {
            
            if (palabraOriginal[i] == letra){
              
                miArreglo[i]=palabraOriginal[i];
                
            }else{
                
                miArreglo[i]='_';
            }
            
        }
        
        return miArreglo;
    }
    
    public static boolean validarJugada(char[] jugadasAnteriores, char[] nuevaJugada){
        
        for (int i = 0; i < jugadasAnteriores.length; i++) {
            
            if (nuevaJugada[i]!='_' && nuevaJugada[i]!=jugadasAnteriores[i]){
                return true;
            }
                
            }
              return false;   
            }
        
       
    }


