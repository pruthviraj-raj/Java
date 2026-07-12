public class polymorphism9 {
            // RUN TIME
    class Animal {
            void sound (){
                System.out.println("Animal make a sound:");
            }
        }
        class Dog extends Animal{
            @Override
            void sound() {
                System.out.println("Dog barks");
            }
        }
        class Cat extends Animal {
            @Override
            void sound() {
                System.out.println("CAt mouuu");
            }
        }
        class Cow extends Animal {
            @Override
            void sound () {
                System.out.println("COW sound");
            }
        }
        
            public static void main(String [] args) {

                polymorphism9 obj= new polymorphism9();

                Animal a;
                a=obj.new Dog();
                a.sound();

                a=obj.new Cat();
                a.sound();

                a=obj.new Cow();
                a.sound();
                
            }
        }
    
