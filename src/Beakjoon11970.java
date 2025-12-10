import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon11970 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean[] wall= new boolean[101];
        int ans= 0;

        for(int i=0;i<2;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            for(int j=a;j<b;j++){
                ans+= !wall[j]?1:0;
                wall[j]= true;
            }
        }

        System.out.println(ans);

    }
}
