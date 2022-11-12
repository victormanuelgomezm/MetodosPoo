package Aritmeticas;

import java.util.Scanner;

public class Ejecutando {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Calculadora yo=new Calculadora();
        
        System.out.println("ingrese el primer numero ");
        yo.num1=leer.nextInt();
        System.out.println("ingrese el segundo numero ");
        yo.num2=leer.nextInt();
        yo.suma();
        yo.resta();
        yo.mayor();
        yo.menor();
        yo.exponente();
        yo.exponente1();
        leer.close();



        


    }
}
