public class constructor5 {
    int Arr[];

    constructor5() {
        Arr= new int[]{10,20,30,40,50};
    }
    void display()
    {
        for(int num:Arr){
            System.out.println(num+"");
        }
    }
    public static void main(String[] args) {
        
        constructor5 c = new constructor5();
        c.display();
    }
    
    
}
