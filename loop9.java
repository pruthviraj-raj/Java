import java.util.Scanner;
/*
fibonacci */

public class loop9 {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of series:");
        int n =sc.nextInt();
        int a=0,b=1,i=1;

        while (i<=n) {
            System.out.println(a+"");
            int c=a+b;
            a=b;
            b=c;
            i++; 
        }
        sc.close();
    }
}
