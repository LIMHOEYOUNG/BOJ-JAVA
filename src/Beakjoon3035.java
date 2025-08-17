import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3035 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int r= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int zr= Integer.parseInt(st.nextToken());
        int zc= Integer.parseInt(st.nextToken());
        StringBuilder sb= new StringBuilder();
        StringBuilder sb2= new StringBuilder();

        for(int i=0;i<r;i++){
            String str= br.readLine();

            for(int j=0;j<c;j++){
                char target= str.charAt(j);
                sb2.append(Character.toString(target).repeat(zc));
            }
            for(int j=0;j<zr;j++){
                sb.append(sb2).append("\n");
            }

            sb2.setLength(0);

            //System.out.println(sb);
        }

        System.out.print(sb);
    }
}
/*
3 3 3 3
.x.
x.x
.x.
 */