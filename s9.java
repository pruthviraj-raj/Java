public class s9 {
    public static void main(String[] args) {
        String str ="Programming";

        int[]freq=new int[256];

        for(int i=0;i<str.length();i++) {
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++) {
            char ch =str.charAt(i);

            if(freq[ch] !=0) {
                System.out.println(ch+"="+freq[ch]);
                freq[ch]=0;
            }
        }
    }
    
}
