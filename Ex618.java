/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex618;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex618 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      System.out.println("Digite o numero");
      int a = input.nextInt();
      squareOfAsterisks(a);
   }
   
   
   
   
   
   
   public static void squareOfAsterisks(int side){
      for(int i = 1; i<=side; i++){
         for(int j=1; j<=side; j++){
            System.out.print('*');
         }
         System.out.println();
      }
         
   }
}
