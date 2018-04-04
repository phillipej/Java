/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex437;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex437 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      System.out.print("Entre com um valor: ");
      double fatorial = input.nextDouble();
      
      double z = 1;
      
      System.out.println("\n\n______");
      // questao a
//      while ( x != 0){
//         
//      z = z*x;
//         
//      System.out.println(" "+z);
//      x--;
//      
//      }
        // questao b
//         double t=0;
//         double total = 0;
//      while ( fatorial != 0 ){
//         t = fatorial;
//
//            z=1;
//            while ( fatorial != 0){
//
//
//               z = z*fatorial;
//               fatorial--;
//               
//            }
//            System.out.printf("O fatorial de %.2f  é  %.2f%n", t, z);
//            fatorial = t - 1;
//            
//            double soma = 1/z;
//            System.out.printf("a soma é %.2f%n",soma);
//            total = soma + total;
//            
//
//         
//      }
//      double soma = total+1;
//      
//      System.out.printf("o valor é %.2f" ,soma);
      
      
      //questao c
      double t=0;
      double total = 0;
      while ( fatorial != 0 ){
         t = fatorial;

            z=1;
            while ( fatorial != 0){


               z = z*fatorial;
               fatorial--;
               
            }
            System.out.printf("O fatorial de %.2f  é  %.2f%n", t, z);
            
            
            double soma = (Math.pow(t, t))/z;
            System.out.printf("a soma é %.2f%n",soma);
            total = soma + total;
            
             fatorial = t - 1;  
         
      }
      double soma = total+1;
      
      System.out.printf("o valor é %.2f" ,soma);
         
         





      
   }
   
}
