public class operator4 {
    public static void main(String[] args) {
        int p =5 ,q =5;

        System.out.println(p++);
        System.out.println(p);

        System.out.println(++q);
        System.out.println(q);
        int x = p++;
        int y= ++q;

        System.out.println(x);  //6
        System.out.println(y);  //7
 
         System.out.println(p);  //7
         System.out.println(q);  //7
    }

    
}
