class Counter{
    private int count =0;

    public synchronized void increment() {
        count++;
    }
    public int  getCount(){
        return count;
    }
}
class MyThread extends Thread{
    Counter counter;
    
    public MyThread(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            counter.increment();
        }
    }

}

public class multithreadsynchro {
    public static void main(String[] args)throws InterruptedException {
        
        Counter counter =new Counter();

        MyThread mt=new MyThread(counter);
          MyThread mt1=new MyThread(counter);

          mt.start();
          mt1.start();

          mt.join();
          mt1.join();

          System.out.println("Final count="+counter.getCount());
    }
    
}
