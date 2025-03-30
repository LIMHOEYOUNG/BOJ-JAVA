import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10804 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int num[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<10;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());

            for(int j=0;j<=((e-s+1)/2);j++){
                int n= num[s+j];
                num[s+j]= num[e-j];
                num[e-j]= n;
            }
        }

        for(int i=1;i<num.length;i++){
            sb.append(num[i]+" ");
        }

        System.out.println(sb);
    }
}

/*
1 2
3 5
1 1
1 1
1 1
1 1
1 1
1 1
1 1
1 1

2 1 5 4 3 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
2 1 5 4 3 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
 */