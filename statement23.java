import java.util.Scanner;

public class statement23 {

    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    int num =sc.nextInt();

    if(num%5==0){
        if(num%3==0){
            System.out.println("the number is divsible 5 and 3:");

        }
        else{
            System.out.println("Not divisible");
        }
    }
    }
    
}
