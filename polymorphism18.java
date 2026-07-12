public class polymorphism18 {
    //run time
    class Device{
        void turnon(){
            System.out.println("Device is on");
        }
        void turnoff (){
            System.out.println("Device is off");
        }
    }
    class light extends Device {
        @Override
        void turnon() {
            System.out.println("light is on");
        }
        @Override
        void turnoff() {
            System.out.println("light off");
        }
    }
    class fan extends Device {
        @Override
        void turnon () {
            System.out.println("fan is on");
        }
        @Override
        void turnoff () {
            System.out.println("fan is off");
        }
    }
    class ac extends Device {
        @Override
        void turnon () {
            System.out.println("Ac on");
        }
        @Override
        void turnoff () {
            System.out.println("Ac off");
        }
    }
    class tv extends Device {
        @Override
        void turnon () {
            System.out.println("tv on");
        }
        @Override
        void turnoff () {
            System.out.println("tv off");
        }
    }
    public static void main(String[] args) {
        polymorphism18 p18=new polymorphism18();

        Device [] devices ={p18.new light(),p18.new fan(),p18.new ac(),p18.new tv()};

        for(Device d : devices) {
            d.turnon();
            d.turnoff();
            System.out.println();
        }
    }
}
