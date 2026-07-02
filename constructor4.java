public class constructor4 {
    constructor4() {
        System.out.println("object creted");
    }
    public static void main(String[] args) {
        
        constructor4 c1=new constructor4();
         constructor4 c2=new constructor4();
          constructor4 c3=new constructor4();

          System.out.println(c1.hashCode());
          System.out.println(c2.hashCode());
          System.out.println(c3.hashCode());

    }
    
}
