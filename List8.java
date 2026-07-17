import java.util.ArrayList;
import java.util.List;

public class List8 {
    public static void main(String[] args) {
        
        List<String>list1=new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String>list2=new ArrayList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");

        list1.addAll(list2);

        System.out.println(list1);


    }
    
}
