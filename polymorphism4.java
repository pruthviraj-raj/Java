public class polymorphism4 {

    // two integer
    int max(int a,int b)
    {
        return (a>b)?a:b;
    }
    // three integer 
    int max(int a,int b,int c)
    {   
        return max(max(a,b),c);
    }
    // two double value
    double max(double a,double b)
    {   
        return (a>b)?a:b;
    }
    public static void main(String[] args) {
        
        polymorphism4 pol4 =new polymorphism4();
        System.out.println("maximum of 10 and 20="+pol4.max(10, 20));
        System.out.println("maximum of 15,25 and 20="+pol4.max(15, 25, 020));
    }
    
}
