import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon33964 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int x_len= Integer.parseInt(st.nextToken());
        int y_len= Integer.parseInt(st.nextToken());
        int x= 0, y=0;

        for(int i=0;i<Math.max(x_len,y_len);i++){
            if(i<x_len) x+=Math.pow(10,i);
            if(i<y_len) y+=Math.pow(10,i);
        }
        System.out.println(x+y);
    }
}
