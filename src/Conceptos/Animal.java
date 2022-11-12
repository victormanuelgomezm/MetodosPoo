package Conceptos;

public class Animal {
    //atributos
    public String nombre;
    public int edad;
    
    //metodos
    //metodos sin valor de retorno 
    public void registrarAnimal(){
        System.out.println("este es el metodo registrarAnimal()");
    }
    // metodo sin valor de retorno con parametros 
    public void cambiarNombre(String newname){
        nombre=newname;
        System.out.println("el nuevo nombre es "+nombre);
    }
    //metodo con valor de retorno con parametros 
    public int calcularedad(int anioNacimiento){
        edad=2022-anioNacimiento;
        return edad;
    }
}
