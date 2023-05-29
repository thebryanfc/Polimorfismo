package prc;

public class PetStore {
    public static void main(String[] args) {
        Cat garfield =new Cat("garfield","macho",5,"gato");
        Dog firulais =new Dog("firulais","macho",3,"perro");
        Rooster claudio =new Rooster("Claudio","blanco con rojo",1,"gallo");

        System.out.println("Ejemplo de poli");
        System.out.println(garfield.talk());
        System.out.println(firulais.talk());
        System.out.println(claudio.talk());

        System.out.println("Bryan Yaziel Figueroa Castillo");
    }
}
