
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class EmployeeTeste {
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      Employee empregado1 = new Employee("Pedro", "Araujo", 1239);
      
      
      System.out.println("Qual o Nome do Empregado: ");
      String nome = input.next();
      empregado1.setNome(nome);
      
      System.out.println("Qual o Sobrenome do Empregado: ");
      String sobrenome = input.next();
      empregado1.setSobreno(sobrenome);
      
      System.out.println("Qual o Salario do Empregado: (usar virgula)");
      double salario = input.nextDouble();
      empregado1.setSalarioMensal(salario);
      empregado1.setAnual(salario);
      
      
      System.out.printf("%n%nO salario anual do %s é de : %.2f", empregado1.getNome(), empregado1.getAnual());
      double anual = empregado1.getAnual();
      
      empregado1.setAumento(anual);
      System.out.printf("%nAdicionando o aumento de 10%% o salario anual é de: %.2f", empregado1.getAumento());

      
     
      
      
      
   }
}
