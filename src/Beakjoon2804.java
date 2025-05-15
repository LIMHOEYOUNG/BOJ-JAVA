import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2804 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        String str1= st.nextToken();
        String str2= st.nextToken();
        String dot= ".";
        StringBuilder sb= new StringBuilder();
        boolean check= false;

        for(int i=0;i<str1.length();i++){
            char c1= str1.charAt(i);
            for(int j=0;j<str2.length();j++){
                char c2= str2.charAt(j);
                //System.out.println("c1= "+c1+" c2= "+c2);
                if(str2.contains(Character.toString(str1.charAt(i)))){
                    if(c1==c2&&!check) {
                        sb.append(str1+"\n");
                        check=true;
                    }
                    else{
                        sb.append((dot.repeat(i))+c2+(dot.repeat(str1.length()-i-1))+"\n");
                    }
                }
            }
            if(check) break;
        }

        System.out.println(sb);
    }
}
/*
BEST AAAAAAAB
A...
A...
A...
A...
A...
A...
A...
BEST

AB BA
=======
B.
AB

====
AB
.A
 */