import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5063 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int r= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());


            if((e-c)>r){
                sb.append("advertise"+"\n");
            }
            else if((e-c)==r){
                sb.append("does not matter"+"\n");
            }
            else if((e-c)<r){
                sb.append("do not advertise"+"\n");
            }
        }
        System.out.println(sb);
    }
}
