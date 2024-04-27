import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Beakjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        HashMap<String, String> personnel= new HashMap<String,String>();

        for(int i=0; i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String name= st.nextToken();
            String state= st.nextToken();

            if(personnel.containsKey(name)){
                if(!personnel.get(name).equals(state)) personnel.replace(name,state);
            }
            else{
                personnel.put(name,state);
            }
        }

        List<String> keySort= new ArrayList<String>();
        for(String key : personnel.keySet()){
            String value= personnel.get(key);
            if(value.equals("enter")){
                keySort.add(key);
            }
        }

        Collections.sort(keySort, Collections.reverseOrder());

        for(String key : keySort){
            System.out.println(key);
        }
    }
}
