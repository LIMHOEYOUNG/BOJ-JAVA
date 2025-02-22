import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Beakjoon1931 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int room[][]= new int [n][2];
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            room[i][1]= Integer.parseInt(st.nextToken());
            room[i][0]= Integer.parseInt(st.nextToken());
        }

        //2차원 배열 끝나는 시간(room[schedule][0]) 순 정렬
        Arrays.sort(room, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                System.out.println("o1 => "+o1[0]+" "+o1[1]+" o2 => "+o2[0]+" "+o2[1]+" o1[1]-o2[1] => "+(o1[1]-o2[1])+" o1[0]-o2[0] => "+(o1[0]-o2[0]));
                return o1[0]==o2[0]? o1[1]-o2[1]:o1[0]-o2[0];
            }
        });

        int ans =0;
        int emptyRoom=0;

        for(int i=0;i<n;i++){
            if(emptyRoom<=room[i][1]){
                emptyRoom=room[i][0];
                ans++;
            }
        }

        System.out.println(ans);
    }
}
