/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex527;

/**
 *
 * @author phillipeosorio
 */
public class Ex527 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      for(int i=1;i<=5;i++){
         for(int j =1; j<=3;j++){
            for(int k=1; k<=4;k++)
               System.out.print('*');
            
            System.out.println();
            
         }
         System.out.println();
      }
   }
   
}
// o for interno imprime 4 (*), o for do meio faz executar 3 vezes, separando
// por linhas,   o for externo faz essa operacao ser executada 5 vezes