public class s17 {
    /*
    RUN LENGTH ENCODING */

    public static void main(String[] args) {
        
        String str="aaabbcccc";

        for(int i=0;i<str.length();) {

            char ch =str.charAt(i);
            int count =0;

            while (i<str.length() && str.charAt(i) ==ch) {
                count++;
                i++;
            }
            System.out.println(ch+""+count);
        }
    }
    
}
