import java.util.Scanner;

public class statement3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int day =sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
                          case 2:
                       System.out.println("TUESDAY");
                        break;
                       case 3:
                        System.out.println("wensday");
                        break;
                          case 4:
                            System.out.println("thursday");
                            break;
                         case 5:
                                System.out.println("friday");
                                break;
                                default:
                                    System.out.print("invailad");
        }

        
    }
}
