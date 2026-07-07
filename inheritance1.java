class animal {
    void sound(){
        System.out.println("Animal a sound");
    }
}
class Dog extends animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
public class inheritance1 {

    public static void main(String[] args) {
    Dog d=new Dog();
    d.sound();       
    }
    
}
