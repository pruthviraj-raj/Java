public class polymorphism17 {

    // run time
    class Animal {
        void eat () {
            System.out.println("Animal is eating");
        }
        void sound(){
            System.out.println("Animal makes a sound");
        }
    }
    class lion extends Animal {
        @Override
        void eat () {
            System.out.println("Lion eats meat");
        }
        @Override
        void sound () {
            System.out.println("Lion roars");
        }
    }
    class tiger extends Animal {
        @Override
        void eat () {
            System.out.println("Tiger eats meat");
        }
        @Override
        void sound () {
            System.out.println("Tiger growls");
        }
    }
    class elephent extends Animal{
        @Override
        void eat (){
            System.out.println("Elephant eats grass and fruits");
        }
        @Override
        void sound () {
            System.out.println("elephant trumpets");
        }
    }
    public static void main(String[] args) {
        
        polymorphism17 p17 =new polymorphism17();

        Animal[] animals={p17.new lion(),
                           p17.new tiger(), 
                           p17.new elephent()};

                           for(Animal a: animals) {
                            a.eat();
                            a.sound();
                            System.out.println();
                           }
    }
    
}
