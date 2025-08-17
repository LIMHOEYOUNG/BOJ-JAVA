import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon28214 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int p= Integer.parseInt(st.nextToken());
        int ans= 0;

        st= new StringTokenizer(br.readLine());
        int[] bread= new int[n*k+1];

        for(int i=1;i<n*k+1;i++){
            bread[i]= Integer.parseInt(st.nextToken())+ bread[i-1]; //현재+이전
        }

        for(int i=k;i<n*k+1;i+=k){
            //System.out.println(i+" => "+(k-(bread[i]-bread[i-k])));
            if(k-(bread[i]-bread[i-k])<p) ans++;  //묶음-(현재묶음값의 최종-이전묶음값의 최종)= 크림없는 빵
        }

        System.out.println(ans);

    }
}
