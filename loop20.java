public class loop20 {
    /*count digit */
    public static void main(String[] args) {
        int num= 12345;
        int count=0;
        for(;num!=0;num/=10){
            count++;
        }
        System.out.println("Digit="+count);
    }
}
