import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11557 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String univ= "";
            int max= Integer.MIN_VALUE;

            int n= Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                String s= st.nextToken();
                int l= Integer.parseInt(st.nextToken());

                if(max<l){
                    univ=s;
                    max=l;
                }
            }

            sb.append(univ+"\n");
        }

        System.out.println(sb);
    }
}
