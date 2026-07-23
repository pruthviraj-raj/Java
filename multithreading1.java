 class multithreading1 implements Runnable {

    @Override

    public void run()  {
        for(int i=0;i<=5;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        multithreading1 m1=new multithreading1();
        Thread t1=new Thread(m1);
        t1.start();
    }
    
}
