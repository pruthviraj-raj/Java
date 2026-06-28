import java.util.Scanner;

public class statement24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num =sc.nextInt();
        
        if(num%5==0 || (num%3==0)){
            if(num%15!=0){
                System.out.println("NUMber is divisible 3 or 5");
            }
            else{
                System.out.println("not divisible");
            }
        }
    
    }
    
}
