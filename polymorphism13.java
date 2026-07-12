public class polymorphism13 {

    class vehical {
        void start (){
            System.out.println("vehical start");
        }
        void stop () {
            System.out.println("vehical stop");
        } 
    }
    class car extends vehical{
        @Override 
        void start () {
            System.out.println("car start");
        }
        @Override
        void stop () {
            System.out.println("car stop");
        }
    }
    class Bike extends vehical {
        @Override
        void start () {
            System.out.println("Bike start");
        }
        @Override
        void stop () {
            System.out.println("Bike stop");
        }
    }
    class bus extends vehical {
        @Override
        void start () {
            System.out.println("bus start");
        }
        @Override
        void stop () {
            System.out.println("bus stop");
        }
    }

    public static void main(String[] args) {
        polymorphism13 p13 =new polymorphism13();
        vehical v;

        v=p13.new car();
        v.start();
        v.stop();

        v=p13.new Bike();
        v.start();
        v.stop();

        v=p13.new bus();
        v.start();
        v.stop();
    }
    
}
