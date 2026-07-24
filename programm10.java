import java.util.Scanner;

public class programm10 {
    /*
    ARITHMATIC OPERATION USING SWITCH
     */

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter two number");
        int a=sc.nextInt();
         int b=sc.nextInt();

         System.out.println("Enter operator(+,-,*,/):");
         char op =sc.next().charAt(0);

         switch (op) {
            case '+':
                System.out.println("Result="+(a+b));
                break;
             
             case'-':
                  System.out.println("Result="+(a-b));
                break;

             case'*':
                  System.out.println("Result="+(a*b));
                break;
                
                
             case'/':
                  System.out.println("Result="+(a/b));
                break;

                default:
                    System.out.println("invalid oprator");
         }
    }
    
}
