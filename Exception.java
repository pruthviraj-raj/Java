public class Exception {

    public static void main (String [] args) {

            try{

                int a=10;
                int b=0;
                int c=a/b;

                System.out.println(c);
            }
            catch(ArithmeticException e) {
                System.out.println("can not Divisible by 0");
            }
            System.out.println("program continues...");
    }
    
}
