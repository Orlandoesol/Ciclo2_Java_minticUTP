package unidad1;
import java.util.Scanner;


public class ejercicioCaptura {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        b = sc.nextInt();
        if (a==b)
            System.out.println("Los números son iguales");    
        else{
            if (a>b)
                System.out.println(a + " es mayor que " + b);
            else
                System.out.println(b + " es mayor que " + a);
        }
        sc.close();      
    }
}
