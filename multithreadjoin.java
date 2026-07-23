  class Thread1 extends Thread {
    @Override
    public void run () {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
    }
    
}
class Thread2 extends Thread {
    @Override
    public void run () {
        for(int i=6;i<=10;i++) {
            System.out.println(i);
        }
    }
}

public class multithreadjoin{

    public static void main(String[] args) {
        
        Thread1 t1=new  Thread1();
        Thread2 t2=new Thread2();

        t1.start();

        try{
            t1.join();
        }catch(InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
