import java.util.Scanner;

import Salud.Persona;
import Sena.Aprendiz;

public class Pruebas {
    public static void main(String[] args) {
       /*  Scanner leer=new Scanner(System.in);
        Aprendiz aprendiznombre=new Aprendiz();
        System.out.println("ingrese su nombre ");
        aprendiznombre.nombre=leer.next();
        
        System.out.println("ingrese su apellido ");
        aprendiznombre.apellido=leer.next();
        
        System.out.println("ingrese su numero de cedula ");
        aprendiznombre.cedula=leer.nextInt();
        
        System.out.println("ingrese su numero de ficha ");
        aprendiznombre.ficha=leer.nextInt();
        
        System.out.println("ingrese su edad");
        aprendiznombre.edad=leer.next();
        System.out.println("los datos que usted ingreso fueron nombre :"+aprendiznombre.nombre+" \n apellido :"+aprendiznombre.apellido+"\n cedula :"+aprendiznombre.cedula+"\n ficha :"+aprendiznombre.ficha+"\n edad :"+aprendiznombre.edad);

        aprendiznombre.cambiarNombre();*/
        Persona yo=new Persona();
        yo.pedirDatos();
        

        yo.calcularImc();

        

    }
    
}
