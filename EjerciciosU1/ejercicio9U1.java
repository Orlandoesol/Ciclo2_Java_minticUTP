package EjerciciosU1;

import java.text.DecimalFormat;
import java.util.Scanner;
/* 
Pide por teclado el nombre, edad y salario y muestra el salario
○ Si es menor de 16 no tiene edad para trabajar
○ Entre 19 y 50 años el salario es un 5 por ciento más
○ Entre 51 y 60 años el salario es un 10 por ciento más
○ Si es mayor de 60 el salario es un 15 por ciento más
*/
public class ejercicio9U1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nuevoSalario = 0;
        String otro;
        do{
            System.out.println("Ingres su nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Digite su edad: ");
            int edad = sc.nextInt();
            System.out.println("Ingrese el salario: ");
            DecimalFormat df = new DecimalFormat("$###,###.");
            double salario = sc.nextDouble();
            if (edad <= 16){
                System.out.println("Usted no tiene edad para trabajar.");
            }else if(edad > 18 && edad <= 50){
                nuevoSalario = salario * 1.05;
                System.out.println("El empleado " + nombre + " de edad " + edad + " tiene un salario de: " + df.format(nuevoSalario));
            }else if(edad >= 51 && edad <= 60){
                nuevoSalario = salario * 1.1;
                System.out.println("El empleado " + nombre + " de edad " + edad + " tiene un salario de: " + df.format(nuevoSalario));
            }else if(edad > 60){
                nuevoSalario = salario * 1.15;
                System.out.println("El empleado " + nombre + " de edad " + edad + " tiene un salario de: " + df.format(nuevoSalario));    
            }
            System.out.println("Otra ronda?(S/N)");
            otro = sc.next();
         }while(otro.equalsIgnoreCase("S"));
         sc.close();  
    }
}
