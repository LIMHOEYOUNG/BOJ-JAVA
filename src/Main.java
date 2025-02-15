import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        String str= st.nextToken();
        int b= Integer.parseInt(st.nextToken());

        System.out.println(Long.parseLong(str,b));
    }
}
/*
Aa0FfBb1GgCc2HhDd3IiEe4Jj
Aa0FfBb1GgCc2HhDd3IiEe4Jj

Aa0aPAf985Bz1EhCz2W3D1gkD6x
Aa0aPAf985Bz1EhCz2W3D1gkD6x
Aa0aPAf985Bz1EhCz2W3D1gkD6x
 */