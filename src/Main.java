import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c[][]= new char[15][5];
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<5;i++){
            String s= br.readLine();
            for(int j=0;j<s.length();j++){
                char check= s.charAt(j);
                c[j][i]=check;
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(c[i][j]!='\u0000') sb.append(c[i][j]);
            }
        }

        System.out.println(sb);
    }
}
/*
Aa0FfBb1GgCc2HhDd3IiEe4Jj
Aa0FfBb1GgCc2HhDd3IiEe4Jj

Aa0aPAf985Bz1EhCz2W3D1gkD6x
Aa0aPAf985Bz1EhCz2W3D1gkD6x
Aa0aPAf985Bz1EhCz2W3D1gkD6x
 */