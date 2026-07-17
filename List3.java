import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        
        List<String>list=new ArrayList<>();

        list.add("Apple");
        list.add("banana");
        list.add("mango");

        list.set(1, "orange");

        System.out.println(list);
    }
    
}
