import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11098 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int p= Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            int cost= Integer.parseInt(st.nextToken());
            String name= st.nextToken();

            while(p-->1){
                st= new StringTokenizer(br.readLine());

                int c= Integer.parseInt(st.nextToken());
                if(c>cost){
                    cost=c;
                    name= st.nextToken();
                }
            }

            sb.append(name+"\n");
        }

        System.out.println(sb);
    }
}