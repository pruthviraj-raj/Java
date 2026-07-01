public class method3 {
    static boolean isprime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=29;
        if(isprime(num))
            System.out.println(num+"prime");
        else
            System.out.print(num+"not prime");

    }
    
}
