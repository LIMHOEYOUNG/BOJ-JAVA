import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2863 {

    static int cnt=0;
    static double max= Double.MIN_VALUE;
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double arr[][]= new double[2][2];

        for(int i=0;i<2;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            arr[i][0]= Double.parseDouble(st.nextToken());
            arr[i][1]= Double.parseDouble(st.nextToken());
        }

        for(int i=0;i<4;i++) {
            arr=rotation(arr,i);
        }
        System.out.println(cnt);
    }

    public static double[][] rotation(double arr[][],int c){

        double temp[][]= new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                temp[j][1 - i] = arr[i][j];
            }
        }
        double check= (arr[0][0]/arr[1][0])+(arr[0][1]/arr[1][1]);

        if(max<check) {
            max=check;
            cnt=c;
        }

        return temp;
    }
}
