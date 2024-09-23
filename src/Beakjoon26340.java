import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26340 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            String str = br.readLine();
            StringTokenizer st= new StringTokenizer(str);
            sb.append("Data set: "+str+"\n");

            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int f= Integer.parseInt(st.nextToken());

            for(int j=0;j<f;j++){
                if(a>=b){
                    a/=2;
                }
                else{
                    b/=2;
                }
            }

            sb.append(Math.max(a,b)+" "+Math.min(a,b)+"\n\n");
        }

        System.out.println(sb);
    }
}
