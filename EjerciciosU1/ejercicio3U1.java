package EjerciciosU1;

import java.text.DecimalFormat;
import java.util.Scanner;
/* 
Realizar un programa que calcule el sueldo de un trabajador, el programa
solicita el número de horas que has trabajado en un mes, las horas se
pagan a $30.000.
*/
public class ejercicio3U1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nomEmpleado = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas por el empleado: ");
        int horasTrabajadas = sc.nextInt();
        DecimalFormat df = new DecimalFormat("$###,###.");
        double salario = (double)horasTrabajadas * 30000;
        System.out.println("El salario a pagar al empleado " + nomEmpleado + " es: " + df.format(salario) 
                            + "\n Correspondiente a " + horasTrabajadas + " horas de trabajo en el mes.");
        sc.close();
    }
}
