class student{
    //DEFAULT
    String name;
    int rollnu;
    double mark;

    student(){
        name="gopal";
        rollnu=101;
        mark=89.9;
    }
    void display() {
        System.out.println("name:"+name);
         System.out.println("rollnu:"+rollnu);
          System.out.println("mark:"+mark);
    }
    public static void main(String[] args) {
        
        student s=new student();
        s.display();
    }
}