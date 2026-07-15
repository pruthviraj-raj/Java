public class Exception6 {

    public static void main(String[] args) {
        
        int age =15;

        if(age<18){
            throw new IIIegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
    
}
