package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona1;

public class Inicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        Empleado datos1=new Empleado();

        datos1.pedirDatos();
        datos1.mostrarPersona();
        String resultado=datos1.calcularImc();
        System.out.println(resultado);
        if(resultado.equals("Pesobajo")){
            System.out.println("usted debe alimentarse con tarrito rojo");
        
        }
        else if(resultado.equals("Pesoideal")){
            System.out.println("usted puede seguir tomando pola");
        }
        else if(resultado.equals("Tienesobrepeso")){
            System.out.println("usted tiene que comprar un plan de alimentacion ");
        }
        datos1.mayorEdad();
        datos1.setHorasTrabajadas(40);
        datos1.setValorHora(4000);
        datos1.calcularHonorarios();
        leer.close();
    
    }
}
