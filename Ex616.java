/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex616;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex616 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      int a;
      int b;
      
      System.out.println("Digite os dois numeros separados por espaco");
      a = input.nextInt();
      b = input.nextInt();
      
      if(isMultiple(a,b)==true){
         
      System.out.printf("O numero %d é multiplo de %d ? ",b,a);
         System.out.println(isMultiple(a,b));
      
   }else{
         System.out.printf("O numero %d NÃO é multiplo de %d ? ",b,a);
      }
   
}
   
   public static boolean isMultiple(int a, int b){
      
      return b%a==0;
      
      
   }
   
}
