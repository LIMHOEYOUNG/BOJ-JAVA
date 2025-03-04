import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Beakjoon3015 {
    public static class Person{
        private int height;
        private long cnt;

        Person(int h, int cnt){
            this.height= h;
            this.cnt= cnt;
        }

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //3015
        int n= Integer.parseInt(br.readLine());
        Stack<Person> s= new Stack<>();
        long ans= 0;

        for(int i=0;i<n;i++){
            int height= Integer.parseInt(br.readLine());
            Person targetPerson= new Person(height,1);

            while(!s.isEmpty()&&s.peek().height<=height){
                Person p= s.pop();
                ans+= p.cnt;
                if(p.height==height) targetPerson.cnt+= p.cnt;
            }

            if(!s.isEmpty()){
                ans++;
            }

            s.push(targetPerson);
        }

        System.out.println(ans);
    }
}
