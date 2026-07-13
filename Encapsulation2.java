public class Encapsulation2 {

    private String AcNo;
    private double balance;


    public void setAcountNumber(String AcNo) {
        this.AcNo=AcNo;
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
            System.out.println("Deposit:"+amount);
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>=balance) {
            balance=balance-amount;
            System.out.println("withdraw"+amount);
        }else{
            System.out.println("insufficient balance");
        }
    }
    public String getAcNo(){
        return AcNo;
    }

    public double getBalance() {
        return balance;
    }
public static void main(String[] args) {
    Encapsulation2 e2 =new Encapsulation2();
    e2.setAcountNumber("sb12345");
    e2.deposit(10000);
    e2.withdraw(3000);
    e2.withdraw(8000);

    System.out.println("Acountnumber:"+e2.getAcNo());
    System.out.println("Avlible balamce:"+e2.getBalance());
}
    
}
