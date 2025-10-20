import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Beakjoon17363 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        String[][] rotation_board= new String[m][n];
        StringBuilder sb= new StringBuilder();
        HashMap<Character, String> map= new HashMap<>();

        map.put('-',"|");
        map.put('|',"-");
        map.put('/',"\\");
        map.put('\\',"/");
        map.put('<',"v");
        map.put('v',">");
        map.put('>',"^");
        map.put('^',"<");
        for(int i=0;i<n;i++){
            String str= br.readLine();
            for(int j=0;j<m;j++){
                Character c= str.charAt(j);
                rotation_board[j][i]= (map.containsKey(c)?map.get(c):Character.toString(c));
            }
        }


        for(int i=m-1;i>=0;i--){
            for(int j=0;j<n;j++){
                sb.append(rotation_board[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
