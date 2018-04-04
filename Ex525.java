/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex525;

/**
 *
 * @author phillipeosorio
 */
public class Ex525 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      for(int i = 1; i<10;i++){
     
      primo(i);
   }
   
   
   public static int primo (int a){
      int contador = 0;
      
      for(int i=1; i<=a; i++){
         if(a%i==0){
            contador++; // se o numero dividir por outro numero alem dele mesmo
                        // o contador vai registrar isso.

         
      }
      return contador;
      
   }
}

}
}