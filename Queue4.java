import java.util.LinkedList;
import java.util.Queue;

public class Queue4 {

    public static void main(String[] args) {
        
        Queue<Integer>queue=new LinkedList<>();

        System.out.println("is Queue is empty");

        queue.offer(100);
        System.out.println("After adding one element");

        System.out.println("Queue Empty?"+queue.isEmpty());
    }
    
}
