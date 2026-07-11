public class polymorphism7 {

    //TWO NUMBER
    double avg(int a,int b){
        return (a+b) /2.0;
    }
    // three number
    double avg(int a,int b,int c) {
        return (a+b+c) /3.0;
    }
    //four number 
    double avg(int a,int b,int c,int d) {
        return (a+b+c+d) /4.0;
    }
    public static void main(String[] args) {
        polymorphism7 pol7 =new polymorphism7();
 
 System.out.println("Avrage two number="+pol7.avg(10, 20));
 System.out.println("Avg three number ="+pol7.avg(10, 20, 30));
 System.out.println("Avg of four number="+pol7.avg(10, 20, 30, 40));       
        
    }
    
}
