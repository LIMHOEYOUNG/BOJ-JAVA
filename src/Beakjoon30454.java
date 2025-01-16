import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30454 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int nums= 0;
        int max_lines= 0;

        for(int i=0;i<n;i++){
            String str= br.readLine();
            int lines= 0;
            boolean check= false;

            for(int j=0;j<str.length();j++){
                char c= str.charAt(j);

                /*
                1이고 check가 false시 line++
                0이고 check가 true시 check=fasle
                1이고 check가 true시 아무반응x
                 */

                if(c=='0' && check){
                    check= false;
                }
                else if(c=='1'&& !check){
                    lines++;
                    check= true;
                }
            }

            if(lines>max_lines){
                nums=1;
                max_lines=lines;
            }
            else if(lines==max_lines){
                nums++;
            }

        }

        System.out.println(max_lines+" "+nums);
    }
}
