/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calccrescimentodemografico;
import java.util.Scanner;

/**
 *
 * @author phillipeosorio
 */
public class CalcCrescimentoDemografico {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      
      double populacaoAtual = 7600000000.0;
      double taxa = 1.2;
      
      
      
      populacaoAtual = populacaoAtual*taxa;
      System.out.printf("Populacao estimada para o promixo ano: %.0f", populacaoAtual );
      
      populacaoAtual = populacaoAtual*taxa;
      System.out.printf("%nPopulacao estimada em 2 anos: %.0f", populacaoAtual );
      
      populacaoAtual = populacaoAtual*taxa;
      System.out.printf("%nPopulacao estimada em 3 anos: %.0f", populacaoAtual );
      
      populacaoAtual = populacaoAtual*taxa;
      System.out.printf("%nPopulacao estimada em 4 anos: %.0f", populacaoAtual );
      
      
      populacaoAtual = populacaoAtual*taxa;
      System.out.printf("%nPopulacao estimada en 5 anos: %.0f", populacaoAtual );
      
   }
   
   
}
