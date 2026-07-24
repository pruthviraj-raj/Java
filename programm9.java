import java.util.Scanner;
/*
PALINDROME OR NOT */

public class programm9 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num..");
        int num=sc.nextInt();

        int original=num;
        int rev=0;

        //LOGIC
        while (num!=0) {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;            
        }
        if (original==rev) {
            System.out.println("Palindrom number..");
        }
        else{
            System.out.println("not palindrom nuber..");
        }
    }
    
}
