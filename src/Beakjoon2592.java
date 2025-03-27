import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class Beakjoon2592 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        HashMap <Integer, Integer> nums= new HashMap<>();
        int total= 0;
        int mode= 1;

        for(int i=0;i<10;i++){
            int n= Integer.parseInt(br.readLine());
            total+=n;
            if(nums.containsKey(n)){
                int v= nums.get(n);
                mode= Math.max(mode,(v+1));
                nums.put(n,(v+1));
            }
            else{
                nums.put(n,1);
            }
        }

        System.out.println(total/10);

        Set<Integer> keys= nums.keySet();
        for(Integer k: keys){
            //System.out.println(k+" "+mode);
            if(nums.get(k)==mode){
                System.out.println(k);
                break;
            }
        }
    }
}
