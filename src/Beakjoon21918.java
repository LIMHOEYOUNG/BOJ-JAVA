import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Beakjoon21918 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        BitSet electric_bulb= new BitSet(n+1);
        st= new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            if(st.nextToken().equals("1")) electric_bulb.set(i);
        }

        for(int i=0;i<m;i++){
            st= new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken())+1;

            if(x==1){
                if(b==2) electric_bulb.set(a);
                else electric_bulb.clear(a);
            }
            else if(x==2){
                electric_bulb.flip(a,b);
            }
            else if(x==3){
                electric_bulb.clear(a,b);
            }
            else{
                electric_bulb.set(a,b);
            }
        }

        for(int j=1;j<=n;j++){
            sb.append(electric_bulb.get(j)?1:0).append(" ");
        }

        System.out.println(sb);
    }
}