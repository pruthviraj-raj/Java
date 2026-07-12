public class polymorphism14 {
    class payment {
        void pay(double amount) {
            System.out.println("process payment:"+amount);
        }
    }
    class upi extends payment{
        @Override
        void pay(double amount) {
            System.out.println("paid:"+amount+"using upi");
        }
    }
    class creditcard extends payment {
        @Override
        void pay(double amount) {
            System.out.println("paid"+amount+"using credicard");
        }
    }
    class netbankink extends payment {
        @Override
        void pay (double amount) {
            System.out.println("paid"+amount+"netbanking");
        }
    }
        public static void main(String[] args) {
            polymorphism14 p14= new polymorphism14();
            payment p;

            p=p14.new upi();
            p.pay(1500);

            p=p14.new creditcard();
            p.pay(2500);

            p=p14.new netbankink();
            p.pay(5000);

        }
}
