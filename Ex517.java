/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex517;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex517 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      double preco;
      int qnt;
      int num=1;
      double total = 0;
      double valor;
      
      while ( num != 0){
         System.out.println("Digite o código do produto: ");
         num = input.nextInt();
            if(num == 0){
               break;
            }
         System.out.println("Digite a quantidade do produto");
         qnt = input.nextInt();
         
         switch(num){
            case 1:
               valor = qnt * 2.98;
               total = total +valor;
               break;
            case 2:
               valor = qnt * 4.50;
               total = total +valor;
               break;
            case 3:
               valor = qnt * 9.98;
               total = total +valor;
               break;
            case 4:
               valor = qnt * 4.49;
               total = total +valor;
               break;
            case 5:
               valor = qnt * 6.87;
               total = total +valor;
               break;
               
               
               
               
         }
         
         
         
      }
      
      System.out.println("O valor total gasto foi de: "+total);
      
      
      
   }
   
}
