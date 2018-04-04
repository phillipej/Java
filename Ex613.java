/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex613;

import java.util.Random;

/**
 *
 * @author phillipeosorio
 */
public class Ex613 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Random num = new Random();
      
      for(int i=0;i<1000;i++){
      //int c = 2 + 2 * num.nextInt(5);
      //int c =  1 + 2 * num.nextInt(6);
      int c =  6 + 4 * num.nextInt(5);
      System.out.println(c);
      }
   }
   
}
