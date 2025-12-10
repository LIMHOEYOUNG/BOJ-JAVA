import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon12778 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<t;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int m= Integer.parseInt(st.nextToken());
            String s= st.nextToken();
            st= new StringTokenizer(br.readLine());

            if(s.equals("C")){
                //알->숫
                while(m-->0){
                    sb.append((int)(st.nextToken().charAt(0)-'A'+1)).append(" ");
                }
            }
            else{
                while(m-->0){
                    sb.append((char)(Integer.parseInt(st.nextToken())+'A'-1)).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
/*
2
1 C
Z
1 N
26

4
26 C
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
26 C
Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
26 N
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
26 N
26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 */