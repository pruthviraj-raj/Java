public class loop30 {
    /* PERFECT OR NOT PERFECT */
    public static void main(String[] args) {
        
        int n=6;
        int sum=0;
        for(int i=0;i<=n;i++){
            if(n%i==0)sum+=i;
        }
        if(sum==n){
            System.out.println("perfect");
        }else{
            System.out.println("not perfect");
        }
    }
    
}
