public class method2 {
    static int reverser(int num){
        int rev=0;
        while (num!=0) {
            rev=rev*10+num%10;
            num=num/10;

        }
        return rev;
    }
    public static void main(String[] args) {
        
        int num=12345;
        //System.out.println("number"+number);
        System.out.println("Revrsr num:"+reverser(num));
    }
    
}
