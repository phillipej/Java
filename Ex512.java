/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex512;

/**
 *
 * @author phillipeosorio
 */
public class Ex512 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int impar;
      int produto = 1;
      
      for(int i=1; i<=15; i+=2){
         impar = i;
         produto = produto * impar;
         System.out.println(i);
      }
      System.out.printf("%,d", produto);
   }
   
}
