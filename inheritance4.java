class person{
    String name="rahul";

    void display (){
        System.out.println("parent class method");
    }
}
class student extends person{
    String name="pruthvi";

    void show(){
        System.out.println("Child name"+name);
         System.out.println("Parent name"+super.name);
         super.display();
    }
}


public class inheritance4 {
    public static void main(String[] args) {
        student s= new student();
        s.show();
    }
    
}
