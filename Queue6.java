import java.util.LinkedList;
import java.util.Queue;

public class Queue6 {

    public static void main(String[] args) {
        
        Queue<String>queue=new LinkedList<>();

        queue.add("java");
        queue.add("pythoe");
        queue.add("C++");
        queue.add("Sql");

        for(String item: queue) {
            System.out.println(item);
        }
        System.out.println("Queue After printing:"+queue);
    }
    
}
