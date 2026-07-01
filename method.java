import java.util.Scanner;

 public class method  {
    int add(int a,int b){
         int ans= a + b ;
         return ans;
    }



    public static void main(String[] args) {
        method m1 =new method();
        
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();

        System.out.println("print the input sum:");
        int ans = m1.add(a, b);
        System.out.println(ans);
        sc.close();
    }
}
