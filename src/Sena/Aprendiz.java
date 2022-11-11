package Sena;

import java.util.Scanner;

public class Aprendiz {
    Scanner leer=new Scanner(System.in);
    //atributos
    public String nombre="victor";
    public String apellido;
    public int cedula;
    public int ficha;
    public String edad;
    //metodos
    public void cambiarNombre(){
        System.out.println(" el nombre actual es "+nombre+" ingrese el nuevo nombre ");
        nombre=leer.next();
        leer.nextLine();
        System.out.println("el nuevo nombre es "+nombre);
    }
    
}
