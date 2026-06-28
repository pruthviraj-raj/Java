import java.util.Scanner;

public class loop10 {
    /*CHECK PRIME NUMBER */
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();

        int i=2;
        boolean PRIME=true;
        while (i<num) {
            if(num%i==0){
                PRIME =false;
                break;
            }
            i++;
        }
        if(num<=1){
            System.out.println("Not prime");
        }else if(PRIME){
            System.out.println("prime number:");
        }else{
            System.out.println("not prime");
        }
    }
    
}
