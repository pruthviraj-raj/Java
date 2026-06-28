import java.util.Scanner;

public class lopp7 {
    /****
    count digit number
    input:98765432
    output:8 */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter then number");
        int num =sc.nextInt();

        int count =0;

        while (num!=0) {
            count++;
            num=num/10;
        }
        System.out.println("number of digit="+count);
    }
    
}
