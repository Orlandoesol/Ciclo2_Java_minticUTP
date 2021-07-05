package EjerciciosU1;

import java.util.Scanner;
/* 
Muestra la serie de fibonacci hasta un número pedido por teclado. Por
ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
1, 2, 3, 5, 8, 13, 21, 34, 55, 89.
*/
public class ejericicio10U1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1, aux = 0, limite;
        System.out.println("Ingrese el numero hasta que quiere ver la serie: ");
        limite = sc.nextInt();
        System.out.println("\nSerie fibonacci hasta el " +  limite );
        for (int i = 0; i < limite; i++){
            if( n1 <= limite && n2 < limite){
                System.out.print( n1 + ", ");
                aux = n1 + n2;
                n1 = n2;
                n2 = aux;                
            }else{
                System.out.print( n1 + ".");
                break;
            }   
        } 
        sc.close();
    }    
}
