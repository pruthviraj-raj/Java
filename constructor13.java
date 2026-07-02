public class constructor13 {

    int account;
    String name;
    double balance;

    constructor13( int account, String name, double balance) {
        this.account=account;
        this.name=name;
        this.balance=balance;
    }

        void display() {
            System.out.println(account);
            System.out.println(name);
            System.out.println(balance);

        }
        public static void main(String [] args) {
            constructor13 c13= new constructor13(1234, "dhananjay", 45769464);
            c13.display();
        }
    }
    

