import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int h= Integer.parseInt(st.nextToken());
        int w= Integer.parseInt(st.nextToken());

        int o= 0;
        int z= 0;
        for(int i=0;i<h;i++){
            String str= br.readLine();

            for(int j=0;j<w;j++){
                char c= str.charAt(j);

                if(c=='0'){
                    z++;
                }
                else if(c=='1'){
                    o++;
                }
            }
        }

        System.out.println(Math.min(z,o));
    }
}
