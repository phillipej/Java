/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex416;

/**
 *
 * @author phillipeosorio
 */
public class Ex416 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
   int x = 1;
   int total = 0;
   
   while(x <= 10){
      int y = x *x;
      System.out.println(y);
      total += y;
      ++x;
   }
   
      System.out.printf("total é %d%n", total);
   
   
   }
   
}
