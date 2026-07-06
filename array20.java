import java.util.HashMap;

public class array20 {
    public static void main(String[] args) {

        int []arr={10,20,30,20,10,30};
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0 )+1);
        }
        for(Integer key: map.keySet()){
            System.out.println(key+""+map.get(key));
        }
    }
    
}
