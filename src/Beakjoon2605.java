import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Beakjoon2605 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> person= new ArrayList<>();

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=1;i<=n;i++){
            person.add(Integer.parseInt(st.nextToken()),i);
        }

        StringBuilder sb= new StringBuilder();
        for(int i=person.size()-1;i>=0;i--){
            sb.append(person.get(i)).append(" ");
        }

        System.out.println(sb);

    }
}
