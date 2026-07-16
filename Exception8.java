public class Exception8 {

    public static void main(String[] args) {
        
        int a=10;
        int b=0;

        try {
            int resuslt =a/b;

            System.out.println("Result:"+resuslt);
        }
        catch(ArithmeticException e) {
            System.out.println("Can not divided by o");
        }
        System.out.println("program Eened");
    }
    
}
