package EjerciciosU1;

import java.util.Scanner;
/* 
Realizar un programa que permita controlar el juego de piedra, papel, tijera
introduciendo P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
de cada ronda preguntar si desea volver a jugar.
*/
public class ejercicio8U1 {
    public static void main(String[] args){
      System.out.println("Juego piedra-papel-tijera");
      Scanner sc = new Scanner(System.in);
      String selecJug1, selecJug2, rondaNueva;
      do{
         System.out.println("Jugador 1; elija P(Piedra),L(Papel) o T(Tijera)");
         selecJug1 = sc.next();
         System.out.println("Jugador 2; elija P(Piedra),L(Papel) o T(Tijera)");
         selecJug2 = sc.next();
         
         if((selecJug1.equalsIgnoreCase("P") && selecJug2.equalsIgnoreCase("P"))
         || (selecJug1.equalsIgnoreCase("L") && selecJug2.equalsIgnoreCase("L"))
         || (selecJug1.equalsIgnoreCase("T") && selecJug2.equalsIgnoreCase("T"))){
            System.out.println("Empate!!!");
         }else if ((selecJug1.equalsIgnoreCase("L") && selecJug2.equalsIgnoreCase("P"))
                  || (selecJug1.equalsIgnoreCase("P") && selecJug2.equalsIgnoreCase("T"))
                  || (selecJug1.equalsIgnoreCase("T") && selecJug2.equalsIgnoreCase("L"))){
                     System.out.println("Gana el jugador 1!!!");
         }else{
            System.out.println("Gana el jugador 2!!!");
         }
         System.out.println("Otra ronda?(S/N)");
         rondaNueva = sc.next();
      }while(rondaNueva.equalsIgnoreCase("S"));
      sc.close();  
   }
}