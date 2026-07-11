public class polymorphism6 {

    // BASIC SALARY
    int calculatesalary(int basic){
        return basic;
    }
    //BASIC + BONUS
    int calculatesalary(int basic,int bonus){
        return basic+bonus;
    }
    // BASIC + BONUS + INCENTIVE
    int calculatesalary(int basic,int bonus,int incentive) {
        return basic+bonus+incentive;
    }
    public static void main(String[] args) {
        
        polymorphism6 pobj =new polymorphism6();
        System.out.println("salary="+pobj.calculatesalary(6000));
        System.out.println("salary with bonus="+pobj.calculatesalary(6000, 1500));
        System.out.println("salary with bonus and incentive="+pobj.calculatesalary(6000, 1500, 1000));
    }
    
}
