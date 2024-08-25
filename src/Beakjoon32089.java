import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            int n= Integer.parseInt(br.readLine());
            if(n==0) break;
            StringTokenizer st= new StringTokenizer(br.readLine());

            int max_person=0;

            int person[] = new int[n];

            for(int i=0;i<n;i++){
                person[i]=Integer.parseInt(st.nextToken());
            }

            for(int i=0;i<n-2;i++){
                max_person=Math.max((person[i]+person[i+1]+person[i+2]),max_person);
            }
            sb.append(max_person+"\n");
        }

        System.out.println(sb);
    }
}
