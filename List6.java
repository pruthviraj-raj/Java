import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List6 {

    public static void main(String[] args) {
        
        List<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);

        Set<Integer>duplicates=new HashSet<>();
        Set<Integer> seen =new HashSet<>();

        for(int num:list) {
            if(!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate Element:"+duplicates);
    }
    
}
