/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex425;

/**
 *
 * @author phillipeosorio
 */
public class Ex425 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      int count = 1;
      
      while(count <= 10)
      {
         System.out.println(count % 2 == 1 ? "*****" : "++++++++");
         ++count;
      }
   }
   
}
