/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex610;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex610 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      double x = 0;
      double y = 0;
      
      
      
      while(x >= 0){
         System.out.println("Entre com o numero para arredondar, ou um negativo para sair");
         x = input.nextDouble();
         
         if(x >= 0){
         System.out.printf("Proximo inteiro: %d", (int) roundToInteiro(x));
         System.out.printf("%nCasa decimal: %.1f", roundToDecimal(x));
         System.out.printf("%nCasa centesimal: %.2f", roundToCentesimo(x));
         System.out.printf("%nCasa de Milhar: %.3f%n%n", roundToMilhar(x));
         }
      }
      
   }
   
   
   public static double roundToDecimal(double x){
     double y = Math.floor(x*10+0.5)/10;
      return y;
      
   }
   
   public static double roundToCentesimo(double x){
      double y = Math.floor(x*100+0.5)/100;
      return y;
   }
   
   public static double roundToMilhar(double x){
      double y = Math.floor(x*1000+0.5)/1000;
      return y;
   }
   
   public static double roundToInteiro(double x){
      double y = Math.floor(x+0.5);
      return y;
   }

   
   
}
