import java.util.Scanner;

public class statement11{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();

        System.out.println("Enter the number");

        if(num %2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

    }
}