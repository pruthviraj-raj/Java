import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Queue5 {

    public static void main(String[] args) {
        
        Queue<Integer>queue=new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Original Queue:"+queue);

        //Queue->Stack
        Stack<Integer>stack=new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        // Stack->Queue

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        System.out.println("Reversev Quque:"+queue);
    }
    
}
