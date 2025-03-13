import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10822 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine(),",");
        int ans= 0;

        for(; st.hasMoreElements();){
            ans+= Integer.parseInt(st.nextToken());
        }

        System.out.println(ans);
    }
}
