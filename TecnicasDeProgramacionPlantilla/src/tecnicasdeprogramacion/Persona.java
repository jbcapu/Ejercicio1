/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;

/**
 *
 * @author utku28
 */
public class Persona {
    
    private String name;
    private String lastName;
    private int dni;

    public Persona() {
    }

    public Persona(String name, String lastName, int dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setName(String nombre){
        for (int i = 0; i < nombre.length(); i++) {
            if(nombre.charAt(i)>=48 && nombre.charAt(i)<=57 ){
                this.name=null;
                return;
            }
                
        }
        this.name=nombre;
    }

    public String getName() {
       return name; 
    }

    public int getDni() {
        return dni;
    }
    
}
