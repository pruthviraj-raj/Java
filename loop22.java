public class loop22 {
    /*
    sum of digit */
    public static void main(String[] args) {
        
    
      int num=123456789;
        int sum=0;

        for(;num!=0;num/=10){
           sum+=num%10;
        }
        System.out.println("SUM="+sum);
    
}
}