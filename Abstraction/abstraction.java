public class abstraction {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();
        // System.out.println(h1.color);
        // h1.changeColor();
        // System.out.println(h1.color);
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor called...");
        // color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called....");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called...");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}