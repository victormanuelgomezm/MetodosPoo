package Aritmeticas;

import java.util.Scanner;

public class Calculadora {
    // atributos 
    int num1,suma,resta,nummayor,nummenor; 
    int num2;
    double exponum1,exponum2;
    //metodos
    public void suma(){
        suma=num1+num2;
        System.out.println("la suma de los dos numeros es "+suma);
    }
    public int resta(){
        resta=num1-num2;
        System.out.println("la resta es "+resta);
        return resta;


    }
    public int mayor(){
        if (num1>num2){
            System.out.println("el numero mayor es "+num1);
            nummayor=num1;
        }
        else if (num1<num2){
            System.out.println("el numero mayor es "+num2);
            nummayor=num2;
        }
        return nummayor;
    }
    public void menor(){
        if (num1>num2){
            System.out.println("el numero menor es "+num2);
            
        }
        else if (num1<num2){
            System.out.println("el numero menor es "+num1);
            
        }
        
    }
    public double exponente(){
        Scanner leer=new Scanner(System.in);
        System.out.println("digite a que numero quiere elevar el numero  "+num1);
        exponum1=leer.nextDouble();
        exponum1=(Math.pow(num1, exponum1));
        System.out.println("su resultado es "+exponum1);
        return exponum1;

    }
    public double exponente1(){
        Scanner leer=new Scanner(System.in);
        System.out.println("digite a que numero quiere elevar el numero  "+num2);
        exponum2=leer.nextDouble();
        exponum2=(Math.pow(num2, exponum2));
        System.out.println("su resultado es "+exponum2);
        return exponum2;

    }

    //metodo sin valor de retorno que sume los dos numeros 

    //metodo con valor de retorno que reste los dos numeros 

    // metodo con valor de retorno que devuelva cual es el numero mayor 

    // metodo sin valor de retorno que devuelva cual es el numero menor

    //metodo con valor de retorno que elero aleve cada num ndicaexponente que sea ido por el usuario
    
}
