
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
public class DateTeste {
   
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      Date data1 = new Date(2, 3, 4);
      
      
      System.out.print("Que dia é?:  ");
      int dia = input.nextInt();
      data1.getDia();
      
      System.out.print("Qual o mês?: ");
      int mes = input.nextInt();
      data1.setMes(mes);
      
      System.out.print("Qual o ano?: ");
      int ano = input.nextInt();
      data1.setAno(ano);
      
      System.out.printf("a data hoje é %s%n", data1.displayDate(dia, mes, ano));
}
}
