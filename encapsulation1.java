public class encapsulation1 {

    private int empld;
    private double salary;

    public void setEmpId(int empld) {
        this.empld = empld;
    }
    public void setSalary(double salary) {
        if(salary>=0) {
        this.salary=salary;
        }else{
            System.out.println("Invalid salary");
        }
    }
    public int  getEmpId() {
        return empld;
    }
    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        encapsulation1 e1=new encapsulation1();
        e1.setEmpId(101);
        e1.setSalary(50000);

        System.out.println("Empoleeid: "+e1.getEmpId());
        System.out.println("salary:"+e1.getSalary());

        e1.setSalary(-1000);
    }
    
}
