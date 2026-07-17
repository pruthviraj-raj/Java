import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List9 {

    public static void main(String[] args) {
        
        List<Integer>list1=Arrays.asList(10,20,30,40);
        List<Integer>list2=Arrays.asList(10,20,30,40);

        if(list1.equals(list2)) {
            System.out.println("Both list are Equals");
        }else{
            System.out.println("list are not equals");
        }
    }
    
}
