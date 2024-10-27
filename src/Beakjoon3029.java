import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int times[][]= new int[3][4];

        for(int i=1;i<times.length;i++){
            StringTokenizer st= new StringTokenizer(br.readLine(),":");
            for(int j=1;j<times[0].length;j++){
                times[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int sT=3600*times[1][1]+60*times[1][2]+times[1][3];
        int fT=3600*times[2][1]+60*times[2][2]+times[2][3];

        int tT= fT-sT;
        //86400

        if(tT<=0){
            tT+=86400;
        }

        System.out.println(String.format("%02d:%02d:%02d",(tT/3600),((tT/60)%60),(tT%60)));
    }
}
