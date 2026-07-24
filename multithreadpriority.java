class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thread name:"+getName()+"|priority:"+getPriority());
    }

}

public class multithreadpriority {
    public static void main(String[] args) {
        
        MyThread m1= new MyThread("THREAD ->A");
         MyThread m2= new MyThread("THREAD ->B");
          MyThread m3= new MyThread("THREAD ->C");

          m1.setPriority(Thread.MIN_PRIORITY);   //1
          m2.setPriority(Thread.NORM_PRIORITY);  //5
          m3.setPriority(Thread.MAX_PRIORITY);   //10

          m1.start();
          m2.start();
          m3.start();
    }
    
}
