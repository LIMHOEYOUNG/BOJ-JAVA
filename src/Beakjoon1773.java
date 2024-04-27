import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1773 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int n= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());

        //boolean check[]= new boolean[c+1];
        int time[]= new int[n];
        for(int i=0;i<n;i++){
            time[i]=Integer.parseInt(br.readLine());
        }

        long count=0;
        for(int i=c;i>0;i--){
            for(int j=0;j<time.length;j++){
                if(i%time[j]==0) {
                    //check[i]=true;
                    //System.out.println("i = "+i);
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);

//        int count2=0;
//        for(int i=0;i<check.length;i++){
//            if (check[i]) count2++;
//        }
//
//        System.out.println("count2 = "+count2);
    }
}

/*
1 3
2
 */