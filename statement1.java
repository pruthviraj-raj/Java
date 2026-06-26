import java.util.Scanner;

public class statement1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();

        if(age<=10){
            System.out.println("Child");
        }
        else if(age>12 && age<18){
            System.out.println("tenager");
        }
        else
        {
        System.out.println("Adlut");
        }
    }
    
}
