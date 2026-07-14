public class s13 {
    /*COUNT NUMBER OF WORDS
     */
    public static void main(String[] args) {
        
        String str="java is object oriented lan";

        String[] words =str.trim().split("\\s+");

        System.out.println("Words="+words.length);
    }
    
}
