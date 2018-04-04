/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */

import java.util.Scanner;

public class HeartRatesTeste {
   
   public static void main(String[] args){
      
      HeartRates pessoa = new HeartRates("Pedro", "Jose", 1, 2, 12);
      
      Scanner input = new Scanner(System.in);
      
      
      System.out.println("Digite o seu Nome: ");
      String nome = input.next();
      pessoa.setNome(nome);
      
      System.out.println("Digite o seu Sobrenome: ");
      String sobrenome = input.next();
      pessoa.setSobrenome(sobrenome);
      
      System.out.println("Digite o dia do seu nascimento: ");
      int dia = input.nextInt();
      pessoa.setDia(dia);
      
      System.out.println("Digite o mes do seu nascimento: ");
      int mes = input.nextInt();
      pessoa.setMes(mes);
      
      System.out.println("Digite o ano do seu nascimento: ");
      int ano = input.nextInt();
      pessoa.setAno(ano);
      
      pessoa.setCardMax(ano);
      int max = pessoa.getCardMax();
      pessoa.setMaxAlvo(max);
      pessoa.setMinAlvo(max);
      
      
      
      System.out.printf("A sua freguencia cardiaca max é de: %d", pessoa.getCardMax());
      System.out.printf("%nA freguencia cardiaca alvo é entre %.2f - %.2f", pessoa.getMinAlvo(), pessoa.getMaxAlvo() );
   
   }
   
}
