public class Exception13 {

    public static void main(String[] args) {
        
        int age =15;

        try {
            if(age<18) {
                throw new ArithmeticException("not eligible");
            }
            System.out.println("Eligible");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("progrsm end");
    }
    
}
