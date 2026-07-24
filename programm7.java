import java.util.Scanner;
/*
FIBONACCI SERIES */

public class programm7 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the num..");
        int n =sc.nextInt();

        int a=0,b=1;

        System.out.println("FIBONACCI SERIES:"+a+""+b+"");

        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.println(c+"");
            a=b;
            b=c;
        }
    }
    
}
