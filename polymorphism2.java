public class polymorphism2{

    //no parameter
    void Display()
    {
        System.out.println("student details");
    }
        //one parameter
    void Display(String name)
    {
        System.out.println("Name:"+name);
    }
    // two parameter
    void Display(String name,int age)
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public static void main (String[] args){
            polymorphism2 pol2 =new polymorphism2();
            pol2.Display();
            pol2.Display("pruthviraj");
            pol2.Display("pruthviraj",25);


    }
}