package Principal;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego {
    //atributos
    private String nombre;
    private int eleccion;
    private int moneda;
    
    Scanner leer=new Scanner(System.in);

    @Override
    public void iniciar(){
        System.out.println("ingrese el nombre del jugador ");
        nombre=leer.nextLine();
    }
    @Override
    public void jugar(){
        System.out.println("escoge 1 cara o 2 sello ");
        eleccion=leer.nextInt();
        System.out.println("moneda girando");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
    }
    @Override
    public void finalizar(){
        if(moneda==1 && eleccion==1){
            System.out.println("cayo cara seleccionaste cara ganaste"+nombre);
        }
        else if(moneda==1 && eleccion==2){
            System.out.println("cayo cara seleccionaste sello perdiste"+nombre);
        }
        else if(moneda==2 && eleccion==2){
            System.out.println("cayo sello seleccionaste sello ganaste"+nombre);
        }
        else if(moneda==2 && eleccion==1){
            System.out.println("cayo sello seleccionaste cara perdiste"+nombre);
        }
        
    }
}
