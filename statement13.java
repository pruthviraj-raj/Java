import java.util.Scanner;
/*Any year is input through the keyboard write a program 
to determain  the year is a leep  year or not   
 */
public class statement13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter year");
       int year=sc.nextInt();

    if((year %4==0 && year%100!=0)||(year%400==0)){

        System.out.println(year+"is a leep year");
    }else
    {
        System.out.println(year+"not leep year");
    }

    }
    
}
