/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex516;

import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex516 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner input = new Scanner(System.in);
      int i;
      int a;
      int b;
      int c;
      int d;
      
      
         
            System.out.print("\nDigite o número e pressione enter: ");
            i = input.nextInt();
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            
            
            for(int g=0; g<i;g++){
               System.out.print('*');
            }
            
            
            System.out.println();
            for(int g=0; g<a;g++){
               System.out.print('*');
            }
            
            
            System.out.println();
            for(int g=0; g<b;g++){
               System.out.print('*');
            }
               
               
            System.out.println();
            for(int g=0; g<c;g++){
               System.out.print('*');
            }
            
            
            System.out.println();
            for(int g=0; g<d;g++){
               System.out.print('*');
            }
            
      
      
      
   }
   
}
