public class Exception17 {

    public static void main(String[] args) {
        
        try {


            try{

                int a=10;
                int b=0;

                System.out.println(a/b);
            }
            catch(ArithmeticException e) {
                System.out.println("Inner catch csn not divode by 0");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("outer catch");
        }
        System.out.println("end program");
    }
    
}
