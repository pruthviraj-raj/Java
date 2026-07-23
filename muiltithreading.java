class multithreading extends Thread{
    @Override
    public void run(){
        System.out.println("thread is running..");
    }

    public static void main(String[] args) {
        multithreading m=new multithreading();

        m.start();
        
    }
    
}
