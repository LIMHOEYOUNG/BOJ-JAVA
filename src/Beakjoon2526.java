import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Beakjoon2526 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int p= Integer.parseInt(st.nextToken());
        int check= n;
        ArrayList<Integer> result= new ArrayList<>();
        result.add(n);
        int ans= 0;

        while(true){
            check= (check*n)%p;

            if(result.contains(check)) {
                ans= result.size()-result.indexOf(check);
                break;
            }
            else if(check==0){
                ans= 1;
                break;
            }
            else result.add(check);
        }

        System.out.println(ans);
    }
}
