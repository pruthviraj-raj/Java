public class polymorphism15 {
    //RUN TIME 
    class product{
        void discount() {
            System.out.println("no DISCOUNT");
        }
    }
    class electronics extends product {
        @Override
        void discount () {
            System.out.println("electronics discount: 10%");
        }
    }
    class clothing extends product {
        @Override
        void discount (){
            System.out.println("clothing discounr:20%");
        }
    }
    class furniture extends product {
        @Override
        void discount () {
            System.out.println("furniture discount :15%");
        }
    }
    public static void main(String[] args) {
        polymorphism15 p15 =new polymorphism15();
        product p;

        p=p15.new electronics();
        p.discount();

        p=p15.new clothing();
        p.discount();

        p=p15.new furniture();
        p.discount();
    }
    
}
