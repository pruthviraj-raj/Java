public class Exception12 {
    public static void main(String[] args) {
        
        try {
            String str =null;
            System.out.println(str.length());

            int a=10;
            int b=0;

            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmatic exception");
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
        System.out.println("program end");
    }
    
}
