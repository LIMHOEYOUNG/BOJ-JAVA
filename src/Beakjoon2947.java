import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2947 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int ans= 0;
        int nums[]= new int[5];
        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<nums.length;i++){
            nums[i]= Integer.parseInt(st.nextToken());
        }

        StringBuilder sb= new StringBuilder();
        bubleSort(nums, sb);

        System.out.print(sb);

    }

    public static void bubleSort(int[] nums, StringBuilder sb){
        for(int p=nums.length-1;p>0;p--) {
            for (int i = 0; i < p; i++) {
                if (nums[i] > nums[i + 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;

                    sb.append(Arrays.toString(nums).replace("[", "").replace("]", "").replace(",", "")+"\n");
                }

            }
        }
    }
}
