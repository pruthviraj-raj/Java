public class polymorphism3 {
  int id;
  String name;

  polymorphism3() {   //student
    id=0;
    name="not assinged";
  }
  // constructor id
  polymorphism3(int id){   //student
    this.id=id;
    this.name=name;

  }
  polymorphism3(int id ,String name){  //student
    this.id=id;
    this.name=name;
  }

  void Display(){
    System.out.println("ID:"+id);
    System.out.println("name:"+name);
    System.out.println("");
  }
  public static void main(String[] args) {
    
    polymorphism3 pol3=new polymorphism3();

    polymorphism3 p1 =new polymorphism3();
    polymorphism3 p2=new polymorphism3(101);
    polymorphism3 p3 =new polymorphism3(102,"pruthvi");
    p1.Display();
    p2.Display();
    p3.Display();
  }
    
}
