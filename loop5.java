import java.util.Scanner;
/***
input:5
output:120 */
public class loop5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the num:");
        int num =sc.nextInt();
        int fact =1;
        int i=1;
        while (i<=num) {
            fact=fact*i;
            i++;
        }
        System.out.println("factorial="+fact);
    }
    
}
