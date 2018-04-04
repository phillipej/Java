/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex424;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex424 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      int passou = 0;
      int reprovou = 0;
      int contador = 0;
      
      while(contador < 10){
         System.out.println("Entre com o resultado (1 = passou, 2 reprovou)");
         
            int result = input.nextInt();
            
            while ( result > 2){
               System.out.println("outro");
               result = input.nextInt();
            }
            
            
            if (result == 1){
               passou = passou + 1;
            }else{
               reprovou = reprovou +1;
            }
            
            contador++;
            
            
           
      }
      
      System.out.printf("Passaram %d%nFalharam %d%n",passou, reprovou);
      
      if(passou > 8){
         System.out.println("Professor ganha bonus");
      }
   }
   
}
