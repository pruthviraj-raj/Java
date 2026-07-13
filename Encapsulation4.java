public class Encapsulation4 {

    public double lenght;
    public double width;

    //constructoe
    public Encapsulation4(double lenght,double width) {
        this.lenght=lenght;
        this.width=width;
    }
    //..GETER METHOD
    public void  setLenght() {
        if(lenght>0){
            this.lenght=lenght;
        }else{
            System.out.println("invalid lenghth");
        }
    }
    public void setWidth(double width) {
        if(width>0){
            this.width=width;
        }else{
            System.out.println("invalid width");
        }
    }
    //get LENGHT
    public double getLenght() {
        return lenght;
    }
    //GET WIDTH
    public double getWidth() {
        return width;
    } 
    // CIRCLCULATE ARAE
    public double area(){
        return lenght*width;
    }
    public static void main(String[] args) {
        Encapsulation4 e4 =new Encapsulation4(10, 5);

        System.out.println("Lenght:"+e4.getLenght());
        System.out.println("Width:"+e4.getWidth());
        System.out.println("Area:"+e4.area());

        
    }
    
}
