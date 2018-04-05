package tecnicasdeprogramacion;

public class Principal extends MetodosSteve{

    public static void main(String[] args) {
      
        
        Persona persona1 = new Persona();
        int numero;
          
        persona1.setName("juan");
//
              persona1.setName(persona1.getName()); 
        imprimir("la persona se llama "+persona1.getName());
  
        persona1.setName(persona1.getName().toLowerCase());
            //    persona1.setName("j3an");

      //  char primerLetra= char(persona1.getName().charAt(0)-32);
        String nombre=persona1.getName();
        imprimir(primerLetra+nombre.substring(1));
        
        //persona1.getName("j3an"); 
        //imprimir("la persona se llama "+persona1.getName());
    
   
    }
    
}
