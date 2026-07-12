public class polymorphism16 {
    //RUN TIME
    class docter {
        void treatpatient() {
            System.out.println("docter treatpatient");
        }
    }
    class cardiologist extends docter{
        @Override
        void treatpatient (){
            System.out.println("docter is cardiologist");
        }
    }
    class dentist extends docter {
        @Override
        void treatpatient (){
            System.out.println("docter is dentist");
        }
    }
    class neurologist extends docter {
        @Override
        void treatpatient (){
            System.out.println("docter is neurologist");
        }
    }
    public static void main(String[] args) {
        polymorphism16 p16=new polymorphism16();

        docter[] docter={ p16.new cardiologist(),
                           p16.new dentist(),
                           p16.new neurologist() };

                          for(docter d: docter)
                          {d.treatpatient();

                          }
    }
    
}
