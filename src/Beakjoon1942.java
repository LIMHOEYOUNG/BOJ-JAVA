import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1942 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<3;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String startTime[] = st.nextToken().split(":");
            String endTime[] = st.nextToken().split(":");

            int s_hour = Integer.parseInt(startTime[0]), s_min= Integer.parseInt(startTime[1]), s_sec=  Integer.parseInt(startTime[2]);
            int e_hour = Integer.parseInt(endTime[0]), e_min= Integer.parseInt(endTime[1]), e_sec=  Integer.parseInt(endTime[2]);
            int count=0;

            for(;;){
                if((s_hour==e_hour)&&(s_min==e_min)&&(s_sec==e_sec)) break;
                if((s_hour*10000 + s_min*100 + s_sec)%3 ==0) count++;

                s_sec++;

                if(s_sec==60) {
                    s_sec=0;
                    s_min++;
                }
                if(s_min==60) {
                    s_min=0;
                    s_hour++;
                }
                if(s_hour==24) {
                    s_hour=0;
                    s_min=0;
                    s_sec=0;
                }
            }
            if((s_hour*10000 + s_min*100 + s_sec)%3 ==0) count++;
            sb.append(count+"\n");

        }
        System.out.println(sb);
    }
}
