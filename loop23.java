public class loop23 {
    /*
    FIND THE LARGEST DIGIT */
    public static void main(String[] args) {
        int num=487; 
        int max=0;
        for(;num!=0;num/=10){
            int d=num%10;
            if(d>max)max=d;
        }
        System.out.println("LARGEST="+max);
    }
    
}
