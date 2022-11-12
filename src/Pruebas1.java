import Conceptos.Animal;

public class Pruebas1 {
    public static void main(String[] args) {
        Animal panda=new Animal();
        panda.nombre="bambu";
        panda.cambiarNombre("copito");
        panda.calcularedad(2015);
        //System.out.println("la edad del panda es "+panda.calcularedad(2015));
        System.out.println("la edad del panda es ");
    }
}
