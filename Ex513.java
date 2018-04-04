/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex513;

/**
 *
 * @author phillipeosorio
 */
public class Ex513 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      long fatorial=1;
      
      for(int i=1;i<=10;i++){
         System.out.print("Fatorial de: "+i);
         fatorial = i * fatorial;
         System.out.println("  é  "+fatorial);
      }
      
      
   }
   
}
