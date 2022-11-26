package Principal;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("ingrese 1 para calcular el area del cuadrado\n ingrese 2 para calcular el area del triangulo\n ingrese 3 para calcular el area del rectangulo\n ingrese 4 para calcular el area del circulo");
        int seleccion=leer.nextInt();

        switch (seleccion) {
            case 1:
            Cuadrado c1=new Cuadrado();
            //poner el valor del lado 
            System.out.println("ingrese el valor del lado del cuadrado");
            float l=leer.nextFloat();
            c1.setLado(l);
            c1.calcularArea();
                break;
            case 2:
            Triangulo c2=new Triangulo();
            //poner el valor del lado 
            System.out.println("ingrese el valor de la base del triangulo");
            float b=leer.nextFloat();
            c2.setBase(b);
            System.out.println("ingrese el valor de la altura del triangulo");
            float a=leer.nextFloat();
            c2.setAltura(a);
            c2.calcularArea();
                break;
            case 3:
            Rectangulo c3=new Rectangulo();
            System.out.println("ingrese el valor de la base del rectangulo");
            float v=leer.nextFloat();
            c3.setBase(v);
            System.out.println("ingrese el valor de la altura del rectangulo");
            float h=leer.nextFloat();
            c3.setAltura(h);
            c3.calcularArea();
                break;
            case 4:
            Circulo c4=new Circulo();
            System.out.println("ingrese el valor del radio del circulo");
            float r=leer.nextFloat();
            c4.setRadio(r);
            c4.calcularArea();
                break;
            default:
                break;
        }
        leer.close();
    }
}
