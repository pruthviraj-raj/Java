
class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);

            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class multithreadAlive {
    public static void main(String[] args) {
        MyThread mt=new MyThread();

        System.out.println("Befor start():"+mt.isAlive());
        mt.start();

        System.out.println("After start():"+mt.isAlive());

        try{
            mt.join();
        }catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("After join():"+mt.isAlive());
    }
    
}
