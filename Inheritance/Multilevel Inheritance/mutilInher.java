public class mutilInher {
    public static void main(String[] args) {
        Dogs badal = new Dogs();
        badal.eat();
        badal.legs=4;
        System.out.println(badal.legs);
    }    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void Breathes(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    int legs;
}

class Dogs extends Mammals{
    String bread;
}