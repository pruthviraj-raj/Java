import java.util.ArrayList;
import java.util.List;

public class List2 {

    public static void main(String[] args) {
        
        List<String>list=new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("c++");

        list.add(1,"javascritp");

        System.out.println(list);
    }
    
}
