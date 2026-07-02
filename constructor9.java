public class constructor9 {
    int lenght,width;

    constructor9(int lenght,int width){
        this.lenght=lenght;
        this.width=width;

    }
    void area(){
        System.out.println("Area="+(lenght*width));
    }
    public static void main(String[] args) {
        constructor9 c9 =new constructor9(10, 05);
        c9.area();
    }
    
}
