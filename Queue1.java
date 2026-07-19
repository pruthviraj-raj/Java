import java.util.*;

public class Queue1 {

    public static void main(String[] args) {
        
        Queue<String>queue=new LinkedList<>();

        queue.add("Paven");
        queue.add("GOpal");
        queue.add("Amit");

        System.out.println(queue.poll());
        
    }
    
}
