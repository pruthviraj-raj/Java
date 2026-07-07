public class array24 {
    public static void main(String[] args) {
        
        int [] arr= {2,3,4,5,6};
        System.out.println(arr[4]);
        System.out.println(arr[0]);

        arr[0]=90;  //upadating array
        System.out.println(arr[0]);


        //traversing aarray
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");

            // size of array
            System.out.println("Size og array:"+arr.length);
        
        }
    }
    
}
