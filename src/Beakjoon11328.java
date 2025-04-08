import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11328 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();


        while(n-->0){
            int check[]= new int[26];
            StringTokenizer st= new StringTokenizer(br.readLine());
            String str1= st.nextToken();
            String str2= st.nextToken();

            if(str1.length() != str2.length()) sb.append("Impossible\n");
            else{
                for(int i=0;i<str1.length();i++){
                    char c1= str1.charAt(i);
                    char c2= str2.charAt(i);

                    check[c1-'a']+=1;
                    check[c2-'a']-=1;
                }

                boolean result= true;
                for(int i=0;i<check.length;i++){
                    if(check[i]!=0) {
                        result=false;
                        break;
                    }
                }

                sb.append(result?"Possible\n":"Impossible\n");
            }
        }

        System.out.println(sb);
    }
}