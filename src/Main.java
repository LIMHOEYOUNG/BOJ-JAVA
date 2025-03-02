import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String univ= "";
            int max= Integer.MIN_VALUE;

            int n= Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                String s= st.nextToken();
                int l= Integer.parseInt(st.nextToken());

                if(max<l){
                    univ=s;
                    max=l;
                }
            }

            sb.append(univ+"\n");
        }

        System.out.println(sb);
    }
}

//1463, 토마토 다른 풀이로 가능 다시
