import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon29267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        StringBuilder sb= new StringBuilder();

        int s=0;
        int inventory=0;

        for(int i=0;i<n;i++){
            String str= br.readLine();

            switch (str){
                case "save":
                    s=inventory;
                    break;
                case "load":
                    inventory=s;
                    break;
                case "shoot":
                    if(inventory!=0) inventory-=1;
                    break;
                case "ammo":
                    inventory+=k;
                    break;
            }

            sb.append(inventory+"\n");
        }

        System.out.println(sb);
    }
}
