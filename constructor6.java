public class constructor6 {
    int lenght;
    int width;

    constructor6() {
        lenght=15;
        width=8;
    }
    void area(){
        System.out.println("Area="+(lenght*width));
    }
    public static void main(String[] args) {
        constructor6 c1 =new constructor6();
        c1.area();
    }
    
}
