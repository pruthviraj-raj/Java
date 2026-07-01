public class method9 {
    static void greet() {
        //static
        System.out.println("Static mehtod");
    }
    //non static
    void farewell(){
        System.out.println("non static method");
    }
    public static void main(String[] args) {
        method9 obj =new method9();
        obj.farewell(); //call non static method
        method9.greet();
    }
    
}
