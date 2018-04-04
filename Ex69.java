/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex69;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex69 {
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      for(int i=0 ; i<10; i++){
         System.out.println("Entre com um valor double: ");
         double x = input.nextDouble();
         double y = (int) Math.floor(x+0.5);
         
         
         
         System.out.printf("Arredondado: %d",(int) y);
         System.out.printf("%nO valor original é: %f%n", x);
         
      }
   }
   
}
