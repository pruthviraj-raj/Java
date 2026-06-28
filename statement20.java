import java.util.Scanner;

public class statement20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("number");
        int num = sc.nextInt();

        if(num%5==0 || num%3==0){
            System.out.println("Divisible 3 OR 5");
        }
        else
        {
            System.out.println("NOt divisible 3 OR 5");
        }
    }
    
}
