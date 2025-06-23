public class Oops{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
         System.out.println(p1.color);

         Bankaccount myAcc = new Bankaccount();
         myAcc.username = "devansh";
         myAcc.changePassword("asdfggh");
         System.out.println(myAcc.username);
        //  System.out.println(myAcc.changePassword);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int chem, int phy, int math){
        percentage = (chem+phy+math)/3;
    }
}

class Bankaccount{
    public String username;
    private String password;

    public void changePassword(String pwd){
        password = pwd;
    }
}
