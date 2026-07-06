public class array14 {

    public static void main(String[] args) {
        
        int []arr={12,45,7,89,23,56};
        int smallest =Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<smallest){
                secondsmallest=smallest;
                smallest=num;
            }else if(num>smallest && num<secondsmallest){
                secondsmallest=num;
            }
        }
        if(secondsmallest==Integer.MAX_VALUE){
            System.out.println("Second smallest:");
        }else{
            System.out.println("Secondsmallest:"+secondsmallest);
        }
    }
    
}
