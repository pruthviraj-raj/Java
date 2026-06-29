public class loop21 {
    /*reverse number using loop */
    public static void main(String[] args) {
        int num=1234;
        int rev=0;

        for(;num!=0;num/=10){
            rev=rev*10+num%10;
        }
        System.out.println("REVRSE="+rev);
    }
}
