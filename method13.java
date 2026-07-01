public class method13 {

    static boolean isarmstroing(int n){
        int original=n;
        int sum =0;

        while (n!=0) {
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }  
            return original == sum ;
        }
        public static void main (String [] args){
            if(isarmstroing(153))
                System.out.println("armstrong num");
            
            else
                System.out.println("not armstrong");
            }

        
    
    
}
