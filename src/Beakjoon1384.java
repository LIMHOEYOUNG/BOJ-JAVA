import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1384 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n=0;
        int group=0;

        StringBuilder sb= new StringBuilder();
        while((n=Integer.parseInt(br.readLine()))!=0){
            group++;
            sb.append("Group "+group+"\n");

            String message[][]= new String[n][n];

            for(int i=0;i<n;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                message[i][0]=st.nextToken();
                int m=1;
                while (st.hasMoreTokens()){
                    message[i][m]=st.nextToken();
                    m++;
                }
            }

            boolean check=false;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(message[i][j].equals("N")){
                        int who = i-j<0?i-j+n:i-j;
                        sb.append(message[who][0]+" was nasty about "+message[i][0]+"\n");
                        check=true;
                    }
                }
            }

            if(!check) sb.append("Nobody was nasty\n");

            sb.append("\n");
            /*
            boolean check = false;

            String name[]= new String[n];
            String result[]= new String[n];
            boolean search[]= new boolean[n];
            for(int i=0;i<n;i++) {
                //그룹 loop
                StringTokenizer st = new StringTokenizer(br.readLine());
                name[i] = st.nextToken();

                String np="";
                int person=1;
                while(st.hasMoreTokens()){
                    //String alphe = st.nextToken();
                    if(st.nextToken().equals("N")) np+=Integer.toString(person);
                    person++;
                }

                System.out.println("np = "+np);
                if(np!="") {
                    check=true;
                    search[i]=true;
                    result[i]=np;
                }
            }

            if(!check) {
                sb.append("Nobody was nasty\n\n");
                continue;
            }

            for(int i=0;i<n;i++){
                if(search[i]){
                    String str= result[i];

                    //System.out.println("str = "+str);
                    for(int j=0;j<str.length();j++){
                        int num= str.charAt(j)-'0';
                        int who = (i-num)<0?i-num+n:i-num;


                        //System.out.println(name[i]+" = "+num);
                        //.out.println(name[((n+i-1)%n)-1]+" was nasty about "+name[i]);
                        //sb.append(name[((n+i-1)%n)-1]+" was nasty about "+name[i]+"\n");

                        //System.out.println(name[((i+num)==n)?n:((i+num)%n)]+" was nasty about "+name[i]);

                        //System.out.println(name[i]+" write to "+name[who]);

                        sb.append(name[who]+" was nasty about "+name[i]+"\n");
                    }
                }
            }
            sb.append("\n");
             */
        }
        System.out.println(sb);
    }
}

/*
3
ANN N N
BOB N N
CLIVE P P
0
 */

/*
Group1
CLIVE was nasty about ANN
BOB was nasty about ANN
ANN was nasty about BOB
CLIVE was nasty about BOB
 */

/*
6
Zheng P P P P P
Yeng P P P P P
Xiao P P P P P
Will P P P P P
Veronica P P P P P
Utah P P P P P
5
Ann P N P P
Bob P P P P
Clive P P P P
Debby P N P P
Eunice P P P P
0
 */