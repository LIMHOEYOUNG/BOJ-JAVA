import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            double num= Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()){
                String check= st.nextToken();
                if(check.equals("@")){
                    //곱 3
                    num*= 3;
                }
                else if(check.equals("%")){
                    //합 5
                    num+= 5;
                }
                else if(check.equals("#")){
                    //차 7
                    num-= 7;
                }
            }

            sb.append(String.format("%.2f\n",num));
        }

        System.out.println(sb);
    }
}

//1463, 토마토 다른 풀이로 가능 다시
