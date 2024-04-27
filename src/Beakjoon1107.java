import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int breakdownNum= Integer.parseInt(br.readLine());
        boolean breakdwonButton[]=new boolean[10];

        int ans= Math.abs(n-100);

        if(breakdownNum!=0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            for (int c = 0; c < breakdownNum; c++) {
                breakdwonButton[Integer.parseInt(st.nextToken())] = true;
            }
        }
        for(int i=0;i<=999999;i++){
            String check= String.valueOf(i);
            boolean buttonCheck= false;

            for(int j=0; j<check.length();j++){
                if(breakdwonButton[check.charAt(j)-'0']) {
                    buttonCheck=true;
                    break;
                }
            }

            if(buttonCheck) continue;

            ans= Math.min(ans,check.length()+Math.abs(i-n));
        }

        System.out.println(ans);
    }
}
