import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2460 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int person=0;
        int answer=0;
        for(int i=0;i<10;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int outPerson= Integer.parseInt(st.nextToken());
            int inPerson= Integer.parseInt(st.nextToken());

            person+= inPerson-outPerson;
            if(person>10000) person=10000;
            if(person>answer) answer=person;
        }

        System.out.println(answer);
    }
}
