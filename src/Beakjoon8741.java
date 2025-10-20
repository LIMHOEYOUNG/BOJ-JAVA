import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon8741 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            sb.append(1);
        }
        for(int i=0;i<n-1;i++){
            sb.append(0);
        }

        System.out.println(sb);
    }
}
/*
1
1

2
110

3
11100

4
1111000

5
111110000

n
1(n)0(n-1)
 */