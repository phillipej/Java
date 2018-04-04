/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex45;

/**
 *
 * @author phillipeosorio
 */
public class Ex45 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int sum = 0;
      int x = 0;
      
      int f = 0, total;
      
      while ( x < 11){
         sum = sum + x;
         x++;
      }
      while (x <= 10){
            total += x;
            ++x;
      }

         
      
      System.out.println("A soma dos inteiros de 0 a 10 é de " +sum);
      System.out.println("o valor é "+total);
   
}
}
