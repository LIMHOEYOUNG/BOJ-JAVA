import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Beakjoon3040 {
    private static LinkedHashMap<Integer, Boolean> hobit= new LinkedHashMap<>();
    private static int total= 0;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<9;i++){
            int num= Integer.parseInt(br.readLine());
            hobit.put(num,true);
            total+=num;
        }

        check();

        for(Map.Entry<Integer,Boolean> entry1: hobit.entrySet()){
            if(entry1.getValue()) sb.append(entry1.getKey()+"\n");
        }

        System.out.print(sb);
    }

    public static void check(){
        for(Map.Entry<Integer,Boolean> entry1: hobit.entrySet()){
            for(Map.Entry<Integer,Boolean> entry2: hobit.entrySet()){
                if(entry1.getKey().equals(entry2.getKey())) continue;
                if((total-(entry1.getKey()+entry2.getKey()))==100){
                    entry1.setValue(false);
                    entry2.setValue(false);
                    return;
                }
            }
        }
    }
}
