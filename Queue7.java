import java.util.LinkedList;
import java.util.Queue;

public class Queue7 {

    public static void main(String[] args) {
        
        Queue<Integer>queue=new LinkedList<>();

        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(7);
        queue.add(8);
        
        int even=0,odd=0;

        for(int num:queue){
            if(num %2==0)
                even++;
            
            else
                odd++;
            }
            System.out.println("Even:"+even);
            System.out.println("ODD:"+odd);
        }
    }
    

