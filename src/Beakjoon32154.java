import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean team[][]=
                {{true,true,true,true,true,true,true,true,false,true,false,true,true},
                {true,false,true,false,true,true,true,true,true,false,false,true,true},
                {true,false,true,false,true,true,true,true,true,false,false,true,true},
                {true,true,true,false,true,true,true,true,false,false,false,true,true},
                {true,false,true,false,true,true,true,true,false,false,false,true,true},
                {true,false,true,false,true,true,true,true,false,false,false,true,true},
                {true,false,true,false,true,true,true,true,false,false,false,true,true},
                {true,false,true,false,true,true,true,true,false,false,false,true,true},
                {true,false,true,false,true,true,true,true,false,false,false,true,true},
                {true,true,true,false,false,true,true,true,false,false,false,true,true}};
        int n= Integer.parseInt(br.readLine());

        int cnt= 0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<team[n-1].length;i++){
            if(team[n-1][i]) {
                cnt++;
                sb.append(((char)('A'+i))+" ");
            }

        }

        System.out.println(cnt+"\n"+sb);
    }
}
