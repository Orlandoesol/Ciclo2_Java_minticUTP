package EjerciciosU1;

import java.io.IOException;
import java.util.Scanner;

/* 
Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
que calcule el peso ideal.
○ peso ideal mujeres = altura - 120
○ peso ideal hombres = altura - 110
*/
public class ejercicio6U1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sexo;
            System.out.println("Ingrese el sexo (H/M)");
            sexo = sc.nextLine();
            System.out.println("Ingrese la altura: ");
            double altura = sc.nextDouble();
        if(sexo.equalsIgnoreCase("H")){
            double pesoIdeal = altura - 110;
            System.out.println("Su peso ideal es: " + pesoIdeal);
        }
        else if (sexo.equalsIgnoreCase("M")){
            double pesoIdeal = altura - 120;
            System.out.println("Su peso ideal es: " + pesoIdeal + " kgs");
        }
        sc.close();
        
    }
}
