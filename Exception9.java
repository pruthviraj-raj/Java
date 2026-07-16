public class Exception9 {

    public static void main(String[] args) {
        
    int []arr ={10,20,30,40,50};

    try {

        System.out.println(arr[3]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("invalis array index");
    }
    System.out.println("Program Ended");
    
}
 

  }