/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex622;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex622 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      int x =1;
      while(x>0){
         System.out.println("Digite 1 para Celsius -> Fahrenheit");
         System.out.println("Digite 2 para Fahrenheit -> Celsius");
         System.out.println("Digite -1 para finalizar");
         x = input.nextInt();
         
         switch(x){
            case (1):
               System.out.print("Digite a temperatura em Celcius: ");
               double a = input.nextDouble();
               System.out.printf("A temperatura %.2f em fahrenheit é: %.2f%n%n",a ,fahrenheit(a));
               break;
            case(2):
               System.out.print("Digite a temperatura em fahrenheit: ");
               double b = input.nextDouble();
               System.out.printf("A temperatura %.2f em Celcius é: %.2f%n%n",b,celcius(b));
               break; 
             case(-1):
                break;
               
               
            
              
            }
         
         
      }
      
      
   }
   
   public static double celcius(double a){
      double d = 5.0/9.0 *(a-32);
      return d;
   }
   
   public static double fahrenheit(double a){
      double d = 9.0/5.0*a+32;
      return d;
   }
   
}
