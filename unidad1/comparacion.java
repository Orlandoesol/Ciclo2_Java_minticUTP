package unidad1;

import java.util.Scanner;

public class comparacion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pais, capital;
        System.out.println("Ingrese la capital de Colombia: ");
        pais = sc.nextLine();
        capital = "Bogota";
        //if(pais == "Bogota")
        if(pais.equals(capital)){
            System.out.println("Correcto, la capital de Colombia es Bogota");
        }else{
            System.out.println("Capital Incorrecta");
        }
        sc.close();
    }
}
