import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon28289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int check[]= new int[5];
        int p= Integer.parseInt(br.readLine());

        for(int i=0;i<p;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int g= Integer.parseInt(st.nextToken());
            if(g==1) {
                check[4]+=1;
            }
            else{
                int c= Integer.parseInt(st.nextToken());

                if(c==1||c==2) check[1]+=1;
                else if(c==3) check[2]+=1;
                else check[3]+=1;
            }
        }

        for(int i=1;i<check.length;i++){
            System.out.println(check[i]);
        }
    }
}
