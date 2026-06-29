public class loop28 {
    /* PRINT ALL PRIME NUMBER  */
    public static void main(String[] args) {
        
       int num =1234;
       int rev =0;
       int temp=num;

       for(;num!=0;num/=10){
        rev=rev*10+num%10;
       }
       if(temp==rev){
        System.out.println("palindrom");
       }
       else{
        System.out.println("not palindrom");
       }
    }
    
}
