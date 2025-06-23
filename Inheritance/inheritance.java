public class inheritance {
    public static void main(String[] args) {
        Fish sharks = new Fish();
        sharks.eat();
    }
}

class Animal{
    String Color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim");
    }
}