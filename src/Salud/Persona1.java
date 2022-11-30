package Salud;

import java.util.Scanner;

public class Persona1 {
    public Scanner leer=new Scanner(System.in);
    //atributos
    
    private int documento,edad;
    private String nombre,apellido,sexo,tipoDoc,resultado;
    private Double peso,pesoactual,estatura;
    // metdodos
    
    public void pedirDatos(){
        System.out.println("ingrese su tipo de documento");
        tipoDoc=leer.next();
        System.out.println("ingrese el numero de su documento ");
        documento=leer.nextInt();
        System.out.println("ingrese  su nombre ");
        nombre=leer.next();
        System.out.println("ingrese  su apellido");
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
    public Persona1 (){

    }
    public Persona1(int documento, int edad, String nombre, String apellido, String sexo, String tipoDoc,
            String resultado, Double peso, Double pesoactual) {
        this.documento = documento;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.tipoDoc = tipoDoc;
        this.resultado = resultado;
        this.peso = peso;
        this.pesoactual = pesoactual;
    }
    
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getPesoactual() {
        return pesoactual;
    }
    public void setPesoactual(Double pesoactual) {
        this.pesoactual = pesoactual;
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
