import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5032 {
    public static int ans= 0;
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int e= Integer.parseInt(st.nextToken());
        int f= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());

        calc((e+f),c);

        System.out.println(ans);
    }

    public static void calc(int bottle,int c){
        if(bottle<c) return;
        else {
            ans+=bottle/c;
            calc((bottle/c + bottle%c),c);
        }
    }
}
