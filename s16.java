public class s16 {
    /*
    CHECK STRING ROTATION */
    public static void main(String[] args) {
        
        String s1="ABCD";
        String s2="CDAB";

        if(s1.length()==s2.length() && (s1+s2).contains(s2)) {
            System.out.println("ROTATION");
        }
        else{
            System.out.println("Not ROTATION");
        }
    }
    
}
