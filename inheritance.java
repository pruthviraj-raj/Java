
/*SINGLE INHERITANCE */

class person{
    String name="pruthvi";
    int age=25;
    void displayperson() {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class student extends person{
    int roll_no=101;

    void displaystudent() {
        System.out.println("Roll NO:"+roll_no);
    }
}
public class inheritance {
    public static void main(String[] args) {
        
        student s=new student();
        s.displayperson();
        s.displaystudent();
    }
    
}
