public class loop26 {
     /*SUM OF odd NUMBER */
     public static void main(String[] args) {
        int n=10;
        int odd=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0)odd+=i;
        }
        System.out.println("odd="+odd);
     }
    
}
