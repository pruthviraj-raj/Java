public class constructor12 {
    constructor12(int a) {
        System.out.println("one parameter:");
    }
    constructor12(int a,int b){
        System.out.println("Sum="+(a+b));
    }
    public static void main(String[] args) {
     
        new constructor12(10);
        new constructor12(20, 30);
     

    }
    
}
