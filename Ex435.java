/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex435;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex435 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      System.out.println("Entre com o primeiro valor");
      int x = input.nextInt();
      System.out.println("Entre com o segundo valor");
      int y = input.nextInt();
      System.out.println("Entre com o terceiro valor");
      int z = input.nextInt();
      
      
      if (x == y){
         if (y==z){
            System.out.println("Pode ser um triangulo");
         }
      }
      if(x!=y || y!= z){
         System.out.println("um dos valores nao forma triangulo");
//         if(y!=z){
//            System.out.println("valores incompativeis");
//         }
      }
      
   }
   
}
