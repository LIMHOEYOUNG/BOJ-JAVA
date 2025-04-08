import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Beakjoon9506 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int n= 0;

        while((n=Integer.parseInt(br.readLine()))!=-1){
            ArrayList<Integer> nums= new ArrayList<>();
            nums.add(1);
            int total= 1;

            if(n%2!=0) sb.append(n+" is NOT perfect.\n");

            else {
                total= calc(nums, n, total);

                if (total == n) {
                    sb.append(n + " = ");

                    for (int i = 0; i < nums.size(); i++) {
                        sb.append(nums.get(i) + (i != (nums.size() - 1) ? " + " : ""));
                    }

                    sb.append("\n");
                }
                else {
                    sb.append(n + " is NOT perfect.\n");
                }
            }
        }


        System.out.println(sb);
    }

    public static int calc(ArrayList<Integer> nums, int n, int total){
        for(int i=2;i<=(n-1)/2;i++){
            if (n % i == 0) {
                if((n/i)!=i && !nums.contains(i)&& !nums.contains(n/i)){
                    nums.add(n/i);
                    nums.add(i);
                    total+=i+(n/i);
                }
            }
        }

        Collections.sort(nums);
        return total;
    }
}
