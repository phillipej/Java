/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex427;

/**
 *
 * @author phillipeosorio
 */
public class Ex427 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      int row = 10;
      
      
      
      while ( row >= 1)
      {
         int column = 1;
         
         while ( column <= 10)
         {
            System.out.print(row % 2 == 1 ? "<" : ">");
            // se a divisao de row/2 sobrar1 ele imprime <  caso nao sobre nada >
            ++column;
         }
         
         --row;
         System.out.println();
      }
      
      
      
     }
   
}
