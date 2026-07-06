public class array17 {
public static void main(String[] args) {
    

    int []arr ={23,45,66,88,90,24,34};
    int even= 0;
    int odd =0;
    
    for(int num:arr){
        if(num %2==0){
           even++;
        }else{
            odd++;
        }
    }
    System.out.println("Even:"+even);
    System.out.println("ODD:"+odd);
}
}
