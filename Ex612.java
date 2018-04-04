/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex612;

import java.security.SecureRandom;

/**
 *
 * @author phillipeosorio
 */
public class Ex612 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      SecureRandom aleatorio = new SecureRandom();
      
//      int x = 1 + aleatorio.nextInt(2);
//      int y = 1 + aleatorio.nextInt(100);
//      int z = aleatorio.nextInt(9);
//      //int a = 1000 + aleatorio.nextInt(1010);
//      int b = -1 + aleatorio.nextInt(2);
//      int c = -3 + aleatorio.nextInt(11);
//      
//      System.out.println(x);
//      System.out.println(y);
//      System.out.println(z);
//     // System.out.println(a);
//      System.out.println(b);
//      System.out.println(c);
      
      
      for(int i=0; i<=100; i++){
         
        //int ale = -1 + aleatorio.nextInt(3); // a partir do -1 tem 3 posicoes
        int ale =  -3 + aleatorio.nextInt(15); // a partir do -3 tem 15 posicoes
         System.out.println(ale);
         i++;
      }
      
   }
   
}
