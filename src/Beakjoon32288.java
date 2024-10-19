import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            char c= str.charAt(i);

            if (c=='I') sb.append("i");
            else if (c=='l') sb.append("L");
        }

        System.out.println(sb);
    }
}
/*
500
IllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIlIllIllIlIl
 */