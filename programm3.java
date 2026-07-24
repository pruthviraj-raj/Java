import java.util.*;
public class programm3 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("ENTER THE 3 NUMBER");
        int a=sc.nextInt();
         int b=sc.nextInt();
          int c=sc.nextInt();

          if(a>b && a>c) 
            System.out.println("Largest="+a);

            else if(b>c)

                System.out.println("Largest="+b);
          else
            System.out.println("Largest="+c);
    }
}
