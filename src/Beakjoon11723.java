import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon11723 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        ArrayList<String> set= new ArrayList<String>();
        String allNum[]= {"1","2","3","4","5","6","7","8","9","10", "11","12","13","14","15","16","17","18","19","20"};

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            String calc= st.nextToken();
            if(calc.equals("all")){
                set.clear();
                set.addAll(Arrays.asList(allNum));
            }
            else if(calc.equals("empty")){
                set.clear();
            }
            else if(calc.equals("check")){
                String num = st.nextToken();
                if(set.contains(num)) sb.append(1+"\n");
                else sb.append(0+"\n");
            }
            else {
                String num = st.nextToken();
                if(calc.equals("add")&& !set.contains(num)) set.add(num);
                else if(calc.equals("remove")&& set.contains(num)) set.remove(num);
                else if(calc.equals("toggle")){
                    if(set.contains(num)) set.remove(num);
                    else set.add(num);
                }
            }
        }

        System.out.println(sb);
    }
}