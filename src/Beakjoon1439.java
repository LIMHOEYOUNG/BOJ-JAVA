import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Beakjoon1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        char beforeChar= str.charAt(0);
        HashMap<Character, Integer> check= new HashMap<Character, Integer>();
        check.put(beforeChar,1);

        for(int i=1;i<str.length();i++){
            char c= str.charAt(i);
            if(beforeChar!=c){
                if(check.containsKey(c)) check.replace(c,check.get(c)+1);
                else check.put(c,1);

                beforeChar=c;
            }
        }

        if(check.size()==1) System.out.println(0);

        else {
            List<Integer> ans = new ArrayList<>(check.values());
            Collections.sort(ans);

            System.out.println(ans.get(0));
        }
    }
}
