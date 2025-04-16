import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Beakjoon9933 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        Set<String> set= new HashSet<>();

        for(int i=0;i<n;i++){
            StringBuilder str= new StringBuilder(br.readLine()).reverse();

            if(str.toString().equals((str.reverse()).toString())){
                System.out.println(str.length()+" "+((str.toString()).charAt(str.length()/2)));
                return;
            }
            else if(!(set.contains(str.toString())||set.contains(str.reverse().toString()))) set.add(str.toString());
            else {
                System.out.println(str.length()+" "+((str.toString()).charAt(str.length()/2)));
                return;
            }
        }
    }
}
