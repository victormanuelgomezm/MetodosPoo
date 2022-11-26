package Principal;

public class Circulo extends Figura{
    //atributos 
    private float radio;
    //metodo
    public Circulo(){
        
    }
    public Circulo(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea() {
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("el area del circulo es "+area);
        
    }
    
}
