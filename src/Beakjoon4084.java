import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon4084 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int[] orig= {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            int[] tmp= orig.clone();
            int cnt= 0;

            if(orig[0]==0 && orig[1]==0 && orig[2]==0 && orig[3]==0) {
                break;
            }
            else{
                while(true){
                    if(orig[0]==orig[1] && orig[1]==orig[2] && orig[2]==orig[3]) {
                        sb.append(cnt).append("\n");
                        break;
                    }

                    orig[0]= Math.abs(tmp[0]-tmp[1]);
                    orig[1]= Math.abs(tmp[1]-tmp[2]);
                    orig[2]= Math.abs(tmp[2]-tmp[3]);
                    orig[3]= Math.abs(tmp[3]-tmp[0]);

                    cnt+=1;
                    tmp= orig.clone();
                }
            }
        }

        System.out.print(sb);
    }
}