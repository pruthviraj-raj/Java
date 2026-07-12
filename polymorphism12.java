public class polymorphism12 {
    // RUN TIME

    class Employee {

        void calculatesalary() {

        }
    }

    class manager extends Employee {
        @Override
        void calculatesalary () {
            System.out.println("manager salary:80000");
        }
    }
    class developer extends Employee{
        @Override
        void calculatesalary () {
            System.out.println("Developer salary:60000");
        }
    }
    class tester extends Employee{
        @Override
        void calculatesalary () {
            System.out.println("Tester salary:45000");
        }
    }
    public static void main(String[] args) {
        polymorphism12 pol =new polymorphism12();
        
        Employee emp;

        emp=pol.new manager();
        emp.calculatesalary();

        emp =pol.new developer();
        emp.calculatesalary();

        emp=pol.new tester();
        emp.calculatesalary();

    }
    
}
