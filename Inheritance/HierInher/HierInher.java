public class HierInher {
    public static void main(String[] args) {
        fish pari = new fish();
        pari.eat();
        pari.breathes();
        pari.swim();
    }    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}

class fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}

class mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}

class bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}