class shap {
    void display() {
        System.out.println("thise is shape");
    }
}
class circle extends shap{
    double radius=5;
    void area () {
        double area =3.14*radius*radius;
        System.out.println("Area of circle:"+area);
    }
}
class Reactangle extends shap{
    int length =10;
    int width=5;

    void area(){
        int area=length*width;
        System.out.println("Area of Reactangle:"+area);
    }
}
public class inheritance3 {
    public static void main(String[] args) {
    circle c=new circle();
    c.display();
    c.area();
    System.out.println();
    Reactangle r=new Reactangle();
    r.display();
    r.area();       
    }
    
}
