import java.util.Scanner;

public class statement16 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the lenght:");
        int lenght = sc.nextInt();

        System.out.println("Enter the breadth:");
        int breadth =sc.nextInt();

        int area = lenght*breadth;
        int parameter= 2*(lenght*breadth);

        if(area>parameter){
            System.out.println("Area grater than parameter:");
        }
        if(area<parameter){
            System.out.println("parameter grater than Area:");
        }

    }
}