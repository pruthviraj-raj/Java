public class polymorphism8 {

    // ADD
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    // SUBTRACTION
    int sub(int a,int b){
        return a-b;
    }
    double sub(double a,double b) {
        return  a-b;
    }
    // MULTI
    int multi(int a,int b){
        return a*b;
    }
    double multi(double a,double b) {
        return a*b;
    }
    //Divided
    int div(int a,int b){
        return a/b;
    }
    double div(double a, double b) {
        return a/b;
    }
    public static void main(String[] args) {
        polymorphism8 pol8 =new polymorphism8();

System.out.println("Addtion int:"+pol8.add(10, 20));
System.out.println("Addition double:"+pol8.add(10.5,20.5));

System.out.println("Subtraction int:"+pol8.sub(20, 10));
System.out.println("Subtraction double:"+pol8.sub(20.5, 10.5));

System.out.println("Multiplication int:"+pol8.multi(5, 4));
System.out.println("Multiplication double:"+pol8.multi(5.5, 4.4));

System.out.println("Division int:"+pol8.div(20, 5));
System.out.println("Division double:"+pol8.div(20.0, 4.0));
  }
    
}
