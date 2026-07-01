public class method5 {
    static boolean palindrom(int num){
        int original= num;
        int rev=0;

        while (num!=0) {
            rev=rev*10+num&10;
            num/=10;
        }
        return original ==rev;
    }
    public static void main(String[] args) {
        int num=121;
        if(palindrom(num)){
            System.out.print("palindrom");
        
        }else{
            System.out.println("not palindrom");
        }
    }
    
}
