
class animal {
    void eat() {
        System.out.println("Animal food:");
    }
}
class Dog extends animal{
    void barks() {
        System.out.println("Dog barks:");
    }
}
class puppy extends Dog {
    void  weep() {
        System.out.println("puppy weep:");
    }
}


public class inheritance2 {

    public static void main(String[] args) {
        puppy p= new puppy();
        p.eat();
        p.barks();
        p.weep();        
    }
    
}
