import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Beakjoon2309 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stature[]= new int[9];
        int allSum= 0;

        for(int i=0;i<stature.length;i++){
            stature[i]= Integer.parseInt(br.readLine());
            allSum+=stature[i];
        }

        Arrays.sort(stature);
        int tmp= allSum;

        for(int i=0;i<stature.length-1;i++){
            for(int j=i+1;j<stature.length;j++){
                allSum-=stature[i];
                allSum-=stature[j];

                if(allSum==100){
                    for(int k=0;k<stature.length;k++){
                        if(k!=i && k!=j) System.out.println(stature[k]);
                    }

                    return;
                }

                allSum=tmp;
            }
        }
    }
}
