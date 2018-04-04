/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2cap4;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex2cap4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      
     int total = 0;
     int gradeCounter = 0;
     
     
      System.out.print("Entre com o valor da nota ou -1 para finalizar");
      int grade = input.nextInt();
     
     
     while (grade != -1)
     {
        total = total + grade;
        gradeCounter = gradeCounter+1;
        
        System.out.print("Entre com o valor da nota ou -1 para finalizar");
        grade = input.nextInt();
        
     }
     
     if (gradeCounter != 0)
     {
        double average = (double) total / gradeCounter;
        
        System.out.printf("%n O total de %d notas é de: %d", gradeCounter, total);
        System.out.printf("%nA média da Classe é de: %.2f", average);
        
     }
     else
         System.out.println("Nenhuma nota foi adicionada");
      
      
      
      
      
   }
   
}
