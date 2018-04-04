/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex232;
import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class Ex232 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      int a,b,c,d,e;
      
      int neg = 0;
      int pos = 0;
      int zero = 0;
      
      System.out.print("Insira um número: ");
      a = input.nextInt();
      
      System.out.print("Insira um número: ");
      b = input.nextInt();
      
      System.out.print("Insira um número: ");
      c = input.nextInt();
      
      System.out.print("Insira um número: ");
      d = input.nextInt();
      
      System.out.print("Insira um número: ");
      e = input.nextInt();
      
      //Verificando primeiro número
      if(a<0)
         neg = neg + 1;
      
      if(a==0)
         zero = zero + 1;
      
      if(a>0)
         pos = pos + 1;
      
      //Verificando segundo número
      if(b<0)
         neg = neg + 1;
      
      if(b==0)
         zero = zero + 1;
      
      if(b>0)
         pos = pos + 1;
      //Verificando terceiro número
      if(c<0)
         neg = neg + 1;
      
      if(c==0)
         zero = zero + 1;
      
      if(c>0)
         pos = pos + 1;
      //Verificando quarto número
      if(d<0)
         neg = neg + 1;
      
      if(d==0)
         zero = zero + 1;
      
      //Verificando quinto número
      if(d>0)
         pos = pos + 1;
      
      if(e<0)
         neg = neg + 1;
      
      if(e==0)
         zero = zero + 1;
      
      if(e>0)
         pos = pos + 1;
      
      //Imprimindo total de positivos, negativos e zeros
      System.out.printf("Existem %d positivos: ", pos);
      System.out.printf("Existem %d negativos: ", neg);
      System.out.printf("Existem %d iguais a zero: ", zero);
         
   }
   
}
