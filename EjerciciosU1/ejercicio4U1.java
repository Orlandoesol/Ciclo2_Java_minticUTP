package EjerciciosU1;

import java.util.Scanner;
/* 
Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
tabla y mostrar los datos.
*/
public class ejercicio4U1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero diferente de 0: ");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("Tabla del " + num + "\n");
            for(int i=0;i<=10;i++){
                System.out.println( num + " x " + i + " = " + num * i);
            }        
        }else{
            System.out.println("Ingreso un valor erroneo.");
        }
        sc.close();
    }
}
