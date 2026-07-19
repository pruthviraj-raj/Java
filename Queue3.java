import java.util.LinkedList;
import java.util.Queue;

public class Queue3 {
    public static void main(String[] args) {
        
        Queue<String>queue=new LinkedList<>();

        queue.add("java");
        queue.add("pythone");
        queue.add("c++");
        queue.add("java script");
        queue.offer("SQL");

        System.out.println("Queue:"+queue);

        System.out.println("fronted element:"+queue.peek());

        queue.poll();

        System.out.println("Queue After poll():"+queue);

    }
    
}
