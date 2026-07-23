 class multi2  extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("A");
        }
    }
}
class multithreading2A extends Thread {
    @Override

    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("B");
        }
    }
}
class multithreading2 {
public static void main(String []  args) {

    multithreading2 t1=new multithreading2();
    multithreading2A t2=new multithreading2A();

  //  t1.start();
    t2.start();
   }
}
