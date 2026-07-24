import java.util.Scanner;

/*
PRIME OR NOT PRIME */

public class programm6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("ENter the num");
        int n=sc.nextInt();

        //LOGIC
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println("PRIME NO");

        else
            System.out.println("NOT PRIMR NO");
    }
    
}
