import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon18691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int g= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());

            switch (g){
                case 1:
                    sb.append(((e-c)<=0?0:(e-c))+"\n");
                    break;
                case 2:
                    sb.append(((e-c)<=0?0:((e-c)*3))+"\n");
                    break;
                case 3:
                    sb.append(((e-c)<=0?0:((e-c)*5))+"\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
