public class method6 {
    static int factorial(int a){
        if(a==0 ||a==1)
            return 1;
        return a*factorial(a-1);
    }
    public static void main(String[] args) {
        int num= 5;
        System.out.println("factoriall="+factorial(num));

    }
    
}
