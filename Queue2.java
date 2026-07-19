import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

    public static void main(String[] args) {
        
        Queue<Integer>queue=new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Original Queuq:"+queue);
    
    // remove 2 element
    queue.poll();  //10 remove
    queue.poll();    //20 remove

    System.out.println("Reaminig element:"+queue);

}
}
