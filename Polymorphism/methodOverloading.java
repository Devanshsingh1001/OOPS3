public class methodOverloading {
    public static void main(String[] args) {
        Calc C = new Calc();
        System.out.println(C.sum(1, 2));
        System.out.println(C.sum((float)1.5, (float)2.5));
        System.out.println(C.sum(2, 3, 5));
    }
}

class Calc{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }
    int sum(int a ,int b, int c){
        return a + b + c;
    }
}