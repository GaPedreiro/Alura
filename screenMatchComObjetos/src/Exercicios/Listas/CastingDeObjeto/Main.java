package Exercicios.Listas.CastingDeObjeto;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Animal animal = (Cachorro) cachorro;

        if (animal instanceof Cachorro) {
            System.out.println("Animal foi convertido para cachorro.");
        } else if (!(animal instanceof Cachorro)) {
            System.out.println("Animal não foi convertido para cachorro.");
        }
    }
}
