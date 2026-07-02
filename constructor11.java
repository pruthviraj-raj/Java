public class constructor11 {
    String name;
    double salary;
    constructor11(String name,double salary) {
        this.name=name;
        this.salary=salary;
    }
    void displaysalary() {
        System.out.println("Annual salary="+(salary*12));
    }
    public static void main(String[] args) {
        constructor11 c11 =new constructor11("ganesh", 57000);
        c11.displaysalary();
    }
    
}
