import java.util.Scanner;

public class array21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr =new int [5];
        arr[0]=5;
         arr[0]=6;
          arr[0]=7;
           arr[0]=8;
            arr[0]=9;

            System.out.println("Enter the array:");
            for(int i =0;i<arr.length;i++) {
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }

    }
    
}
