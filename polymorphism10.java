public class polymorphism10 {

    class shape {
        void draw() {
            System.out.println("draw the shape");
        }
    } 
    class circle extends shape {
        @Override
        void draw () {
            System.out.println("draw the circle");
        }
    }
    class Ractangle extends shape {
        @Override
        void draw() {
            System.out.println("Draw the Rectangle:");
        }
    }
    class Tringle extends shape {
        @Override
        void draw (){
            System.out.println("Draw the Tringle:");
        }
    }
    public static void main(String[] args) {
        
        polymorphism10 pobj= new polymorphism10();

        shape s;
        s=pobj.new circle();
        s.draw();

        s=pobj.new Ractangle();
        s.draw();

        s=pobj.new Tringle();
        s.draw();
        
    }
    
}
