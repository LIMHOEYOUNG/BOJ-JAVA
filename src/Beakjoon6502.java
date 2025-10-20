import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon6502 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        for(int i=1;;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int r= Integer.parseInt(st.nextToken());
            if(r==0) break;

            int w= Integer.parseInt(st.nextToken());
            int l= Integer.parseInt(st.nextToken());
            double diagonal= Math.sqrt(Math.pow(w,2)+Math.pow(l,2));

            sb.append("Pizza ").append(i).append(" ");
            if(diagonal<=(double)(r*2)){
                sb.append("fits on the table.\n");
            }
            else{
                sb.append("does not fit on the table.\n");
            }
        }

        System.out.print(sb);
    }
}
/*
38 40 60Pizza 1 does not fits on the table.
Pizza 2 does not fits on the table.
 */