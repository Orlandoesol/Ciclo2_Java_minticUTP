package unidad1;

import java.util.Scanner;

//Si la nota es menor a 50 es insuficiente, si la nota esta entre 50 y 59 es suficiente,
//Si la nota esta entre 60 y 79 es buena, si la nota esta entre 80 y 89 es notable
//sobresaliente de 90 a 100
public class promedio {
    public static void main(String[] args){
        int nota;
        Scanner sc = new Scanner(System.in);
        do{
            
            System.out.println("Ingrese la calificación del estudiante : ");
            nota = sc.nextInt();
            if (nota < 50){
                System.out.println("La nota es insuficiente");
            }
            else if (nota >= 50 && nota <= 59){
                System.out.println("La nota es suficiente");
            }
            else if (nota >= 60 && nota <= 79){
                System.out.println("La nota es buena");
            }
            else if (nota >= 80 && nota <= 89){
                System.out.println("La nota es notable");
            }      
            else if(nota >= 90 && nota <= 100){
                System.out.println("La nota es sobresaliente");
            }
        }while(nota > 0);       
        sc.close();              
    }
}
