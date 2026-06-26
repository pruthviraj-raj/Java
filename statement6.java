public class statement6 {

    public static void main(String[] args) {
        int year =2000;

        if(((year %4==0) && (year%100!=0)) ||(year %400==0)){
            System.out.println("LEEP");
        }else{
            System.out.println("comman year");
        }
    }
    
}
