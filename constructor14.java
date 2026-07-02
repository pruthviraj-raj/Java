public class constructor14 {
    double radius;
    
    constructor14(double radius) {
        this.radius=radius;
    }
    void area () {
        System.out.println("Arae="+(3.14*radius*radius));
    }
    public static void main(String[] args) {
        
        constructor14 c14 =new constructor14(7);
        c14.area();
    }

    
}
