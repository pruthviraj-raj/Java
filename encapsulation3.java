public class encapsulation3 {
    private final String imei;
    private String brand;

    //constructir
    public encapsulation3(String imei,String brand) {
        this.imei=imei;
        this.brand=brand;
    }
    //GETER METHOD IMEI
    public String getimei() {
        return imei;
    }
    //GETET METHOD BRAND
      public String getbrand() {
        return brand;
    }
    public void setbrand(String barand) {
        this.brand=brand;
    }
    //display method
    public void display(){
        System.out.println("IMEI:"+imei);
        System.out.println("Brand:"+brand);
    }
    public static void main(String[] args) {
        encapsulation3 e3 =new encapsulation3("2354627488743","samung");
        e3.display();
        

    }


    
}
