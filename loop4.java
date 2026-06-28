import java.util.Scanner;

public class loop4 {
    /****
    input:5
    output:15 */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the num:");
        int num = sc.nextInt();

        int i=1;
        int sum =0;
        while (i<=num) {
            sum =sum+i;
            i++;
        }
        System.out.println("sum:"+sum);

    }
    
}
