package Principal;

import java.util.Scanner;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        Persona datos = new Persona();

        datos.pedirDatos();
        datos.mostrarPersona();
        datos.calcularImc();
        datos.mayorEdad();
        leer.close();
    }
    
}