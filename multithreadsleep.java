public class multithreadsleep extends Thread{
    @Override

    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.print(i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        multithreadsleep s= new multithreadsleep();

        s.start();
    }
    
}
