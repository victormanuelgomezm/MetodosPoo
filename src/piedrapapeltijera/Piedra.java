package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;

public class Piedra implements Juego {
    //atributos
    private String nombre;
    private int eleccion;
    private int moneda;
    
    Scanner leer=new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.println("ingrese el nombre del jugador ");
        nombre=leer.nextLine();
           
    }

    @Override
    public void jugar() {
        System.out.println("escoge 1 para piedra o 2 para tijera o 3 para papel ");
        eleccion=leer.nextInt();
        System.out.println("la maquina esta escojiendo");
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(3)+1;
        
    }

    @Override
    public void finalizar() {
        if(moneda==1 && eleccion==1){
            System.out.println("la maquina escogio piedra seleccionaste piedra empataste"+nombre);
        }
        else if(moneda==1 && eleccion==2){
            System.out.println("la maquina escogio piedra seleccionaste tijera perdiste"+nombre);
        }
        else if(moneda==1 && eleccion==3){
            System.out.println("la maquina escogio piedra seleccionaste papel ganaste"+nombre);
        }
        else if(moneda==2 && eleccion==1){
            System.out.println("la maquina escogio tijera seleccionaste piedra ganaste"+nombre);
        }
        else if(moneda==2 && eleccion==2){
            System.out.println("la maquina escogio tijera seleccionaste tijera empataste"+nombre);
        }
        else if(moneda==2 && eleccion==3){
            System.out.println("la maquina escogio tijera seleccionaste papel perdiste"+nombre);
        }
        else if(moneda==3 && eleccion==1){
            System.out.println("la maquina escogio papel seleccionaste piedra perdiste"+nombre);
        }
        else if(moneda==3 && eleccion==2){
            System.out.println("la maquina escogio papel seleccionaste tijera ganaste"+nombre);
        }
        else if(moneda==3 && eleccion==3){
            System.out.println("la maquina escogio papel seleccionaste papel empataste"+nombre);
        }
        
        
    }



}
