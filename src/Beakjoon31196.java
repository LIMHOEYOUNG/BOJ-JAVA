import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31196 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        StringBuilder sb= new StringBuilder();
        int n= str.length();

        int row= 0;

        // 행 도출
        for(int r=1;r<n;r++){
            int s= n/r;

            //주어진 조건 r ≤ s 및 n = rs인 행이 r
            if(r<=s && r*s==n) row=r;
        }

        //열 도출
        int colum= n/row;
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                //위에서 아래로, 왼쪽에서 오른쪽으로
                sb.append(str.charAt(row*j + i));
            }
        }

        System.out.println(sb);
    }
}
