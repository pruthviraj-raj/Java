public class polymorphism1 {
    
    // Area of suare
    double Area(double a){
        return a*a;
    }

    // Area of Ractangle 
    double Area(double lenght,double width){
        return lenght* width;
    }
    // Area of circle

    double Area(int radius){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        polymorphism1 pboj1 =new polymorphism1();
        
        System.out.println("Area of suare:"+pboj1.Area(0.6));
        System.out.println("Area of ractangel:"+pboj1.Area(10.5,5.0));
        System.out.println("Arae of circle:"+pboj1.Area(7));
    }
    
}
