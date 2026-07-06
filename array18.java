public class array18 {
    public static void main(String[] args) {
        
        int []arr ={11,21,51,111};
        int start=0;
        int end=arr.length-1;

        while (start<end) {
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array:");
        for(int num:arr){
            System.out.println(num+"");
        }
    }
    
}
