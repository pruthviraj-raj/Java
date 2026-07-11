public class polymorphism {
    // method add two integer

    int add(int a,int b){
            return a+b;
    }
    // method two add two double value

    double add(double a,double b){
        return a+b;
    }
    // method add three integer value

    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        polymorphism pobj =new polymorphism();

        System.out.println("sum of two integer:"+pobj.add(10,20 ));
        System.out.println("Sum of double:"+pobj.add(10.5, 10.5));
        System.out.println("sum of three integer:"+pobj.add(10,20 , 030));
    }

    
}
