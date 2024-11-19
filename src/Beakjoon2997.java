import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2997 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int num[]= new int[4];

        for(int i=0;i<3;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }

        num[3]=Integer.MAX_VALUE;

        Arrays.sort(num);


        if(num[1]-num[0]==num[2]-num[1]){
            System.out.println(num[2]+(num[2]-num[1]));
        }
        else{
            if(num[1]-num[0]==(num[2]-num[1])/2){
                System.out.println(num[1]+((num[2]-num[1])/2));
            }
            else{
                System.out.println(num[0]+((num[1]-num[0])/2));
            }
        }

    }
}
