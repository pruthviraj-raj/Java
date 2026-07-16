public class Exception15 {

    public static void main(String[] args) {
        
        try {
            String str ="123A";
            int num=Integer.parseInt(str);

            
            System.out.println(num);

        }
        catch(NumberFormatException e) {
            System.out.println("invalid number ");
        }
        System.out.println("end program");
    }
    
}
