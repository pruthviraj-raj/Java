public class Exception1 {

    public static void main(String[] args) {
        
        try {
            int a=20;
            int b=4;

            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception occured");
        }
        System.out.println("Exception complet..");
    }
    
}
