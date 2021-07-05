package EjerciciosU1;

import java.text.DecimalFormat;
import java.util.Scanner;
/* 
Realizar un programa que realice el promedio de las notas de un alumno,
para ello el programa va a tener que solicitar el nombre del alumno y las
notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
“Reprobado” . Requisitos: Las notas que se ingresan pueden tener
decimales.
*/
public class ejercicio2U1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        String nombreAlumno = sc.nextLine();
        System.out.println("Ingrese la nota de la evaluación 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Ingrese la nota de la evaluación 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Ingrese la nota de la evaluación 3: ");
        double nota3 = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("###.##");
        double promedio = (nota1+nota2+nota3)/3;
        if (promedio >= 3){
            System.out.println("El alumno " + nombreAlumno + ". \"Aprobado\"" + " con un promedio de " + df.format(promedio));
        }
        else{
            System.out.println("El alumno " + nombreAlumno + ". \"Reprobado\"" + " con un promedio de " + df.format(promedio));
        }
        sc.close();
    }
}
