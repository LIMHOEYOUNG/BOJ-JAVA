import java.io.*;
import java.util.*;

public class Mapple {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();
        String str1= st.nextToken();
        String str2= st.nextToken();
        String dot= ".";
        boolean check= false;

        for(int i=0;i<str1.length();i++){
            char c1= str1.charAt(i);
            for(int j=0;j<str2.length();j++){
                char c2= str2.charAt(j);

                if(str2.contains(Character.toString(str1.charAt(i)))){

                    if(c1==c2&&!check) {
                        sb.append(str1+"\n");
                        check=true;
                    }
                    else{
                        //sb.append((dot.repeat(i)));
                        for(int k=0;k<i;k++) sb.append(dot);
                        sb.append(c2);
                        //sb.append((dot.repeat(str1.length()-i-1))+"\n");
                        for(int k=0;k<str1.length()-i-1;k++) sb.append(dot);
                        sb.append("\n");
                    }

                }
            }
            if(check) break;
        }

        System.out.println(sb);
    }
}