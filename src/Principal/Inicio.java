package Principal;

import java.util.Scanner;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        Persona datos = new Persona();

        datos.pedirDatos();
        datos.mostrarPersona();
        String resultado=datos.calcularImc();
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


        


        datos.mayorEdad();
        leer.close();
    }
    
}