import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2948 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int d= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        String day_string[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int day= 3;

        for(int i=0;i<m;i++){
            day+=mon[i];
        }
        day+=d;

        System.out.println(day_string[day%7]);
    }
}
