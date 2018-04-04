/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex429;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex429 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
      int ladoa=1;
      
      
      System.out.print("Entre com o tamanho dos lados do quadrado: ");
      int x = input.nextInt();
      
      while(ladoa<=x){
         int ladob = 1;
        
         while(ladob<=x){
            System.out.print(" * ");
            ladob++;
            
      }
         System.out.println();
         ladoa++;
         
         
      
      }
      
      
   }
   
}
