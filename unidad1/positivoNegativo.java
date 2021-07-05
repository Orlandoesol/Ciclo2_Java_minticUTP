package unidad1;

import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;
        do{
            System.out.println("Ingrese el número: ");
        num1 = sc.nextInt();
        
        if (num1 == 0){
            System.out.println("Ingreso el número cero...");
        }
        else if (num1 > 0 ){
            System.out.println(num1 + " Es positivo");
        }else{
            System.out.println(num1 + " Es negativo");
        }

        }while(num1 >= 0 || num1 <= 0);
        
        sc.close();
    }
}
