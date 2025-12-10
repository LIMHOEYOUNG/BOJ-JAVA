import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Beakjoon11319 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        Random rd= new Random();

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            String str= br.readLine();

            if(rd.nextBoolean()) method1(str,sb);
            else method2(str,sb);
        }

        System.out.print(sb);
    }


    private static void method1(String str, StringBuilder sb){
        char[] chars= {'A','E','I','O','U','a','e','i','o','u'};
        StringTokenizer st= new StringTokenizer(str);
        int total_ch= 0;
        int total_vowels= 0;

        while(st.hasMoreTokens()) {
            String word= st.nextToken();

            for (int i=0;i<word.length();i++) {
                char c= word.charAt(i);
                total_ch+= 1;

                for (int j=0;j<10;j++) {
                    if (c==chars[j]) {
                        total_vowels+= 1;
                        break;
                    }
                }
            }
        }

        sb.append((total_ch-total_vowels)).append(" ").append(total_vowels).append("\n");
    }

    private static void method2(String str, StringBuilder sb){
        str= str.replace(" ","").toLowerCase();
        int total_ch= str.length();
        int total_vowels= 0;

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') total_vowels+=1;
        }

        sb.append((total_ch-total_vowels)).append(" ").append(total_vowels).append("\n");
    }
}
