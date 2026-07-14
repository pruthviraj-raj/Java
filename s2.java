public class s2 {

    public static void main(String[] args) {
        
    
    String s= "SOMANATH";

    String rev="";
    
    for(int i =s.length()-1;i>=0;i--) {
        rev+=s.charAt(i);
    }
    System.out.println(s.equals(rev));
    System.out.println("Original:"+s);
    System.out.println("REverse:"+rev);
}
}