package EjerciciosU1;

import java.util.Scanner;
/* 
Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
adivinar introduciendo el número por teclado. En el caso que el número a
adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
mayor”, de lo contrario, “El número que busca es menor”. El programa
finalizará cuando se introduzca el número correcto. Nota: usar la clase
Random para generar el número aleatorio.
*/
public class ejercicio5U1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int aleatorio = (int) (Math.random()*100);
        //System.out.println(aleatorio);//Imprimir el número aleatorio para probar el programa
        do{
            System.out.println("Esciba el posible número: ");
            numero = sc.nextInt();
            if (aleatorio == numero){
                System.out.println("Fin del programa..."); 
            }else if (aleatorio > numero){
                System.out.println("El numero que busca es mayor");
            }else{
                System.out.println("El numero que busca es menor");                
            }
            
        }while (numero != aleatorio);
        sc.close();        
    }
}
