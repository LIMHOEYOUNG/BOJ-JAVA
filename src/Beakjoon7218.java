import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon7218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        String nums[]= {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(str.contains(nums[i])){
                sb.append((i+1)+" ");
            }
        }

        System.out.println(sb);
    }
}
