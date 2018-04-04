/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phillipeosorio
 */
public class TabelaValores {
   public static void main(String[] args) {
      
      int x = 1;
      
      System.out.println("--N--------10N-------100N-------1000N");
      while (x < 6){
         
         System.out.printf("--%d-------%d-------%d-------%d%n",x,x*10,x*100,x*1000);
         x++;
      }
         
   }
}
