public class s12{
    /*
    REVERSE EACH WORD AND SENTENCE */
    public static void main(String[] args) {
        
        String str="java is language";
        String[]words =str.split("");
        String result="";

        for(String word : words){
            String revword="";
            for(int i=word.length()-1;i>=0;i--) {
            revword+=word.charAt(i);
            }
            result =revword+""+result;
        }
        System.out.println(result.trim());
    }
}