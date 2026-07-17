import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List5 {

    public static void main(String[] args) {
        
        List<String>list=new ArrayList<>();

        list.add("HTML");
        list.add("CSS");
        list.add("java script");
        list.add("REACT");

        // USING LOOP
        System.out.println("using loop");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        // USING ENHANCED LOOP

        System.out.println("\nUsing inhanced loop");
        for(String language:list)  {
            System.out.println(language);
        }
        // USING ITERATOR
        System.out.println("using itratoe\n");
        Iterator<String>itr=list.iterator();
    }
    
}
