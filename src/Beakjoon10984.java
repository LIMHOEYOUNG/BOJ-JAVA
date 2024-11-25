import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10984 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int t= Integer.parseInt(br.readLine());
            int c= 0;
            double g= 0;
            for(int i=0;i<t;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                int target= Integer.parseInt(st.nextToken());
                c+= target;
                g+= target*Double.parseDouble(st.nextToken());
            }

            sb.append(c+" "+String.format("%.1f\n",(g/c)));
        }

        System.out.println(sb);
    }
}
/*
1
3
1 4.3
2 4
3 2
 */