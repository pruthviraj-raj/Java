public class array12 {
    public static void main(String[] args) {
        int [] arr={23,43,54,56,78,98,12};
        int smallest=arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]<smallest) {
                smallest=arr[i];
            }
        }
            System.out.println("smallest num:"+smallest);
    }
    
}
