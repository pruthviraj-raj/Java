public class printingpattern11 {
    /*
    A
    AB
    ABC
    ABCD
     */
    public static void main(String[] args) {
        for(char i='A';i<='D';i++) {
            for(char j='A';j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
