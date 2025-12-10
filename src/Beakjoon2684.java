import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2684 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String str= br.readLine();  //len = 40
            int[] rst= new int[8];

            for(int i=0;i<38;i++){
                String sub_str= str.substring(i,i+3);

                //뒤뒤뒤, 뒤뒤앞, 뒤앞뒤, 뒤앞앞, 앞뒤뒤, 앞뒤앞, 앞앞뒤, 앞앞앞
                switch (sub_str){
                    case "HHH":
                        rst[7]++;
                        break;
                    case "HHT":
                        rst[6]++;
                        break;
                    case "HTH":
                        rst[5]++;
                        break;
                    case "HTT":
                        rst[4]++;
                        break;
                    case "THH":
                        rst[3]++;
                        break;
                    case "THT":
                        rst[2]++;
                        break;
                    case "TTH":
                        rst[1]++;
                        break;
                    case "TTT":
                        rst[0]++;
                        break;
                }
            }

            for(int i=0;i<8;i++){
                sb.append(rst[i]).append(i<7?" ":"\n");
            }
        }

        System.out.print(sb);
    }
}