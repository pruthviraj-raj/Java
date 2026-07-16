import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception16 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        try {

            System.out.println("Enter first num");
            int a=sc.nextInt();

            System.out.println("enter second num");
            int b=sc.nextInt();

            System.out.println("Result="+(a+b));
        }
        catch (InputMismatchException e) {
            System.out.println("Enter only intergr");
        }
            sc.close();
    }
    
}
