public class Encapsulation5 {

    private final int bookid;
    private String title;
    private int avilableCopy;

    Encapsulation5(int bookid,String title,int avilableCopy) {
        this.bookid=bookid;
        this.title=title;
        this.avilableCopy=avilableCopy;
    }
    //GET METHOD
    public int getBookId(){
        return bookid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }

    public void issuBook() {
        if (avilableCopy>0) 
                avilableCopy++;
            else
                System.out.println("book not avlible");
    }
    public void returnBook(){
        avilableCopy++;
    }
    public int getAvilableCopy() {
        return avilableCopy;
    }
    public static void main(String[] args) {
        Encapsulation5 e5= new Encapsulation5(101, "java programming", 3);
        
        System.out.println("book ID:"+e5.getBookId());
        System.out.println("Title:"+e5.getTitle());

        System.out.println("copy:"+e5.getAvilableCopy());
        System.out.println("");
    }
    
}
