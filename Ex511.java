/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex511;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex511 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      System.out.println("Entre com o valor de numeros que serao inseridos");
      int x = input.nextInt();
      int cont= 0;
      int menor=0;
      while( cont < x ){
         System.out.print("Entre com um numero: ");
         int d = input.nextInt();
         menor = d;
            if(d < menor){
               menor = d;
            }
            cont++;
      }
      
      System.out.println("O menor numero digitado foi: "+menor);
   }
   
}
