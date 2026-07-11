public class polymorphism5 {

    // print integer
    void print(int num){
        System.out.println("integer:"+num);
    }
    //PRINT STRING 
    void print(String str){
        System.out.println("String:"+str);
    }
    // PRINT CHARACTER
    void print(char ch){
        System.out.println("Character:"+ch);

    }
    // PRINT BOOLEAN
    void print(boolean value){
        System.out.println("Boolean:"+value);
    }
    public static void main(String[] args) {
        
        polymorphism5 pobj =new polymorphism5();
        pobj.print(101);
        pobj.print("patil");
        pobj.print("A");
        pobj.print(true);
    }
}
