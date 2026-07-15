public class Exception2 {

    public static void main (String [] args) {

        int [] num={1,2,3};


        try {
            System.out.println(num[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            
            System.out.println("Exception caught:"+e);
        }
        finally {
            System.out.println("thise block alwes excuted..");
        }
        System.out.println("program contines..");
    }
}
