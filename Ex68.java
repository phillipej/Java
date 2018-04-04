/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex68;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex68 {

   /**
    * @param args the command line arguments
    */
   public static final int MIN = 2;
   public static final int ADICIONAL = 1;
   private static final int MAX = 10;
   
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      int cliente1  = 3;
      int cliente2 = 4;
      int cliente3 = 5;
      
      int precoTotal = 0;
      for( int x = 1; x < 4 ; x++){
         System.out.println("\nEntre com a quantidade de horas");
         int horas = input.nextInt();
         int preco = calculateCharge(horas);
         System.out.printf("Cliente pagará: %d", preco);
         
         precoTotal = preco + precoTotal;
      }
      
      System.out.println("\n\nO valor a ser pago ontem é de: "+precoTotal);
      
      
      
   }
   
   public static int calculateCharge(int horas){
      
      int preco = 0;
      if(horas <= 3){
         preco = MIN;
         
      }
      
      if (horas > 3){
         preco = ADICIONAL * (horas - 3);
         if (preco > MAX || horas > 24){
            preco = MAX;
         }
         
         
      }
         
      return preco;


     
       
      
   }
   
   
}
