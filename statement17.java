import java.util.Scanner;

public class statement17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark:");
        int mark =sc.nextInt();
        
        if(mark>90){
            System.out.println("Excellence");
        }
        else if(mark>80){
            System.out.println("very Good");
        }
        else if(mark>70){
            System.out.println("Good");
        }
        else if(mark>60){
            System.out.println("can be better");
        }
        else if(mark>50){
            System.out.println("Avarege");
        }
    
    }    
}
