public class constructor8 {
    String name;
    int roolnum;
    double mark;

    constructor8(String name,int roolnum,double mark) {
        this.name=name;
        this.roolnum=roolnum;
        this.mark=mark;
    }
    void display() {
        System.out.println("Name="+name);
        System.out.println("Rollnum="+roolnum);
        System.out.println("Marks="+mark);   
    }
    public static void main(String[] args) {
        constructor8 c8=new constructor8("pranv", 100, 89);
        c8.display();
    }
    
}
