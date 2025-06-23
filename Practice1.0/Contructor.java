public class Contructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "devansh";
        s1.roll = 456;
        s1.password = "akfvbkber";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.password ="wrfilhweil";
        s1.marks[1] = 100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;//only reference copy
    }

    //normal constructor
    Student(){
        marks = new int[3];
        System.out.println("Constuctor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
