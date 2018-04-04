
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
public class HealthProfileTeste {
   
   public static void main(String[] args){
      
      HealthProfile pessoa = new HealthProfile("Pedro", "Jose", 1, 2.9, 12.0);
      
      Scanner input = new Scanner(System.in);
      
      System.out.printf("Qual o seu nome: ");
      String nome = input.next();
      pessoa.setNome(nome);
      
      
      
      System.out.print("Qual seu sexo: (Masc ou Fem) ");
      String sexo = input.next();
      pessoa.setSexo(sexo);
      
      System.out.print("Qual seu ano de nascimento: ");
      int ano = input.nextInt();
      pessoa.setAno(ano);
      
      System.out.print("Qual a sua altura: (em metros)");
      double altura = input.nextDouble();
      pessoa.setAltura(altura);
      
      System.out.print("Qual o seu peso: (em kg)");
      double peso = input.nextDouble();
      pessoa.setPeso(peso);
      
      pessoa.setIdade(ano);
      pessoa.setImc(pessoa.getPeso(), pessoa.getAltura());
      pessoa.setCardMax(ano);
      pessoa.setMaxAlvo(pessoa.getCardMax());
      pessoa.setMinAlvo(pessoa.getCardMax());
      
      
      System.out.printf("Paciente: %s | Sexo: %s | Idade: %d | Ano: %d | Peso: %.2f| Altura: %.2f%n%n%n", pessoa.getNome(), pessoa.getSexo(), pessoa.getIdade(), pessoa.getAno(), pessoa.getPeso(), pessoa.getAltura());
   
      System.out.println("\n\n****************************************");
      System.out.println("           VALORES IMC     ");
      System.out.println("   Abaixo do Peso:    Menos de 18,5");
      System.out.println("   Normal:            Entre 18,5 e 24,9");
      System.out.println("   Acima do Peso:     Entre 25 e 29,9");
      System.out.println("   Obeso:             Acima de 30");
      System.out.println("****************************************\n\n");
      
      System.out.printf("O seu IMC é: %.2f%n", pessoa.getImc());
      
      System.out.printf("A freguencia cardiaca maxima é: %d%n", pessoa.getCardMax());
      System.out.printf("A freguencia cardiaca alvo é de: %.2f - %.2f", pessoa.getMinAlvo(), pessoa.getMaxAlvo());
}
   
}
