import java.util.LinkedList;
import java.util.Queue;

public class Queue8 {
    public static void main(String[] args) {
        
        Queue<Integer>queue=new LinkedList<>();

        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(20);

        int sum=0;

        for(int num:queue){
            sum +=num;
        }
        System.out.println("Sum="+sum);
    }
    
}
