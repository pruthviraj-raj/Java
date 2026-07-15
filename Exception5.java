public class Exception5 {

    public static void main(String[] args) {
        
        try {

            int resuslt=10/0;

        }
        catch(ArithmeticException e) {
            System.out.println("Exception handle");
        }

        finally {
            System.out.println("finaaly bolck executed");
        }
    }
    
}
