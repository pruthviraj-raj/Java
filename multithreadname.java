class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running Thread:"+Thread.currentThread());
    }

    
}


public class multithreadname {
    public static void main(String[] args) {
        
        MyThread m1=new MyThread();

         System.out.println("Default name:"+m1.getName());

         m1.setName("radha");

         System.out.println("upadated name:"+m1.getName());

         m1.start();
    }
    
}
