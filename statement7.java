public class statement7 {
    public static void main(String[] args) {
        
        int mark=85;
        if(mark<50){
            System.out.println("FAIL");

        }else if (mark>=50 && mark<60){
            System.out.println("D gread");
        }
        else if(mark>=60 && mark<70){
            System.out.println("C gread");
        }
        else if (mark>=70 && mark<80){
            System.out.println("B gread");

        }else if(mark>=80 && mark<90){
            System.out.println("A gread");

        }else if (mark>=90 && mark<100){
            System.out.println("A++ gread");

        } else{
            System.out.println("invalide");
        }
    }
    
}
