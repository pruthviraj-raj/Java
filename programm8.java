import java.util.Scanner;

public class programm8 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num..");
        int num=sc.nextInt();

        int sum=0;

        while (num!=0) {
            sum+=num%10;
            num=num/10; 
            
        }
        System.out.print("Sum of digit="+sum);
    }
    
}
