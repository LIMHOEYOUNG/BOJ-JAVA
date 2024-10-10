import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Beakjoon31609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        boolean check[]= new boolean[11];
        ArrayList<Integer> num= new ArrayList<>();
        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            int a= Integer.parseInt(st.nextToken());
            if(!check[a]){
                num.add(a);
                check[a]=true;
            }
        }

        num.sort(Comparator.naturalOrder());

        for(int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }
    }
}
