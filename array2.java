import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int [] arr= new int[5];
        int sum =0;

        System.out.println();
        for(int i =0; i<=5;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[1];
        }
        System.out.println("sum:"+sum);
    }
    
}
