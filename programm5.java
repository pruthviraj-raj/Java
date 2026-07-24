import java.util.Scanner;

/*
REVERSE GIVEN INTEGER NUMBER */

public class programm5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num..");
        int num=sc.nextInt();

        int rev=0;

        //LOGICCCCC
        while (num!=0) {
            int digit=num %10;
            rev=rev*10 +digit;
            num=num/10;            
        }
        System.out.println("REVERSED NUMBER="+rev);
    }
    
}
