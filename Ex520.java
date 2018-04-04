/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex520;

/**
 *
 * @author phillipeosorio
 */
public class Ex520 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      double pi;
      double soma=0;
             
      for(int div = 3; div <= 200; div+=2){
         
         pi = (double) 4/div;
         int d = div;
         d=d-2;
         
         
//         System.out.println(pi);
         
//         if(div <= d+2){
//         soma = soma + pi;
////            System.out.println("fes o mais");
//         }else{
//            soma = soma - pi;
////            System.out.println("fe o menos");
//         }
//         System.out.println(soma);
         
      }
      
//      double pitotal = 4 - Math.abs(soma);
//      System.out.println(pitotal);
      System.out.printf("%.5f", Math.PI);
   }
   
}
