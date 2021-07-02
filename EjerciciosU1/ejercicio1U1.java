package EjerciciosU1;
import java.util.Scanner;

public class ejercicio1U1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = entrada.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int division = num1 / num2;
        int multiplicacion = num1 * num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + resta);
        System.out.println("La división de " + num1 + " y " + num2 + " es igual a " + division);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual a " + multiplicacion);
        entrada.close();

    }
}
