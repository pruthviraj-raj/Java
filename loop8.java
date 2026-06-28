import java.util.Scanner;
/*sum of digit using
input:1234
output:10 */
public class loop8 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the num:");
        int num =sc.nextInt();
        int sum=0;
        while (num!=0) {
            int digit=num%10;
            sum=sum+digit;
            num =num/10;
        }
        System.out.println("sum of digit="+sum);
    }
    
}
