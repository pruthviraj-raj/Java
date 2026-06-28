import java.util.Scanner;

public class statement15 {
    // profit OR loss
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost prise");
        int cp =sc.nextInt();

        System.out.println("Enetr selling prise");
        int sp =sc.nextInt();
        if(sp>cp)  //profit
        {
            System.out.println("you made a profit");
            System.out.println(sp-cp);
        }
        if(sp<sp)  //loss
        {
            System.out.println("you incurd a loss");
        }

    }
    
}
