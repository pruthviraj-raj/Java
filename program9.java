import java.util.Scanner;

public class program9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal");
        float p=sc.nextFloat();

        System.out.println("Enetr of rate of interest:");
        float r=sc.nextFloat();

        System.out.println("Enter time:");
        float t=sc.nextFloat();

        float s1 = (p*r*t) /100;

        System.out.println("principal:"+p);
        System.out.println("rate:"+r);
        System.out.println("time:"+t);

        System.out.println("Simpal interest:"+s1);
    }
    
}
