import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Beakjoon2535 {

    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        //ArrayList<Students> ranking = new ArrayList<Students>();
        ArrayList<Students> ranking = new ArrayList<Students>();
        HashMap<Integer, Integer>check = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            Students student= new Students(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            ranking.add(student);
        }

        Collections.sort(ranking);

        int count=0;
        for(int i=0;i<n;i++){
            int country = ranking.get(i).getCountry();
            if(check.get(country)!=null&&check.get(country)==2) continue;

            if(!(check.containsKey(country))){
                check.put(country,1);
                count++;
            }
            else if(check.containsKey(country)){
                check.put(country, check.get(country)+1);
                count++;
            }

            //System.out.println("Key = "+country+" value = "+ check.get(country));
            System.out.println(ranking.get(i).toString());

            if(count==3) break;
        }
    }
}
class Students implements Comparable<Students> {
    private int country,num;
    private int score;

    public Students(int country, int num, int score){
        this.country=country;
        this.num = num;
        this.score= score;
    }
    @Override
    public int compareTo(Students students){
        return (students.score-this.score);
    }
    void setCountry(int country){
        this.country= country;
    }
    public int getCountry(){
        return this.country;
    }
    void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return this.num;
    }
    void setScore(int score){
        this.score= score;
    }
    public int getScore(){
        return this.score;
    }

    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(this.country+" "+this.num);
        return sb.toString();
    }
}

