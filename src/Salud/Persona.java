package Salud;

import java.util.Scanner;

public class Persona {
    Scanner leer=new Scanner(System.in);
    //atributos
    
    public int documento,edad;
    public String nombre,apellido,sexo,tipoDoc,resultado;
    public Double peso,pesoactual,estatura;
    // metdodos
    public void pedirDatos(){
        System.out.println("ingrese su tipo de documento");
        tipoDoc=leer.next();
        System.out.println("ingrese el numero de su documento ");
        documento=leer.nextInt();
        System.out.println("ingrese el numero de su nombre ");
        nombre=leer.next();
        System.out.println("ingrese el numero de su apellido");
        apellido=leer.next();
        System.out.println("ingrese su peso en kilogramos ");
        peso=leer.nextDouble();
        System.out.println("ingrese su estatura en centimetros ");
        estatura=leer.nextDouble();
        System.out.println("ingrese su edad");
        edad=leer.nextInt();
        System.out.println("ingrese el sexo que usted se considera ");
        sexo=leer.next();

    }
    public void mostrarPersona(){
        System.out.println("los datos que usted ingreso fueron\n tipo de documento :"+tipoDoc+"\n numero de cedula :"+documento+"\n nombre:"+nombre+"\n apellido: "+apellido+"\n peso:"+peso+"\n estatura : "+estatura+"\n edad : "+edad+"\n sexo : "+sexo);
        
    }
    public String calcularImc(){
        pesoactual=peso/(Math.pow(estatura, 2));
        
        System.out.println(pesoactual);
        
        
        if (pesoactual < 20){
            
            resultado="Pesobajo";
        }
        else if (pesoactual == 20 || pesoactual <=25){
            resultado="Pesoideal";
        }
        else {
            resultado="Tienesobrepeso";
        }
        return resultado;
    }
    
    public void mayorEdad (){
        if (edad > 18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }


    
}
