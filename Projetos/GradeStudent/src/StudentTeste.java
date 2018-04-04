/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class StudentTeste {
   
   public static void main(String[] args){
      
      Student account1 = new Student("Alexandre", 93.5);
      Student account2 = new Student("Phillipe", 72.75);
      
      System.out.printf("A nota de %s é: %s%n", account1.getName(), account1.getLetterGrade());
      System.out.printf("A nota de %s é: %s%n", account2.getName(), account2.getLetterGrade());
      
              
      
      
      
      
   }
   
}
