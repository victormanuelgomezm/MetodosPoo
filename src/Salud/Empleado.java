package Salud;

public class Empleado extends Persona1 {
    //atributos

    private String cargo,departamento;
    private int valorHora,horasTrabajadas;
    

    //metodos
    
    public Empleado(){

    }

    public Empleado(String cargo, String departamento, int valorHora, int horasTrabajadas) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Empleado(int documento, int edad, String nombre, String apellido, String sexo, String tipoDoc,
            String resultado, Double peso, Double pesoactual, String cargo, String departamento, int valorHora,
            int horasTrabajadas) {
        super(documento, edad, nombre, apellido, sexo, tipoDoc, resultado, peso, pesoactual);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public void calcularHonorarios(){
         
        float honorario=valorHora*horasTrabajadas;
        double reteIca=honorario*0.00966;
        double total=honorario-reteIca;
        
        System.out.println("el valor a pagar sindescontar reteica es "+honorario+" el reteica que se le descuenta es "+reteIca);
        System.out.println("el valor neto a pagar descontando el reteica es "+total);

    }
}
