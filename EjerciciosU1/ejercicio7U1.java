package EjerciciosU1;

import java.util.Scanner;
/* 
Pedir un número, comprobar si es primo y preguntar si quiere introducir más
(S/N) y volver a pensar.
*/
public class ejercicio7U1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, i, cont = 0;
        String desc;
        do{
            System.out.println("Digite un número: ");
            numero = sc.nextInt();            
            for(i = 1; i <= numero ; i++){
                if(numero % i == 0){
                    cont++;
                }
            }
            if (cont == 2){
                System.out.println("El número " + numero + " es primo.");
            }
            else{
                System.out.println("El número " + numero + " no es primo.");
            }
            System.out.println("Desea introducir otro número?(S/N)");
            desc = sc.next();           
        }while(desc.equalsIgnoreCase("S"));      
    }
}