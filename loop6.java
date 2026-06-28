import java.util.Scanner;

public class loop6 {
    /***
    input:12345
    output:54321 */
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int Reverse=0;
        while (num!=0) {
            int digit=num%10;
            Reverse=Reverse*10+digit;
            num=num/10;
        }
        System.out.println("Reverse="+Reverse);
    }
    
}
