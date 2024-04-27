import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16199 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int date[][]= new int[2][3];
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<2;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                date[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        //생년월일 같거나 이전
        /*
        2020 03 05
        2021 03 04 ---> 0
        2021 03 05 ---> 1
         */
        int check= date[1][0]- date[0][0];
        if(date[1][1]<date[0][1]){
            check--;
        }
        else if(date[1][1]==date[0][1]){
            if(date[1][2]<date[0][2]){
                check--;
            }
        }

        sb.append(check+"\n");

        check= date[1][0]- date[0][0];
        sb.append((check+1)+"\n");
        sb.append(check);

        System.out.println(sb);
    }
}
