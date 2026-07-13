public class encapsulation {

    private String name;
    private int rollno;
    //seter
    public void setName(String name) {
        this.name=name;
    }
    public void setRollo(int rollno) {
        this.rollno=rollno;
    }
    //getter
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollno;
    }

        public static void main(String[] args) {
            encapsulation e= new encapsulation();

            e.setName("patil");
            e.setRollo(101);

            System.out.println("name:"+e.getName());
              System.out.println("name:"+e.getRollNo());
        }
    }

