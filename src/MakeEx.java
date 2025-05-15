import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MakeEx {
    public static void main(String[] args)throws IOException{


        String day_string[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};    //목요일 20090101
        int day= 4;

        //int d=1;
        //int m=1;
        int file_num= 0;
        for(int m=1;m<mon.length;m++){


            for(int d=1;d<=mon[m];d++){
                StringBuilder sb1= new StringBuilder();
                StringBuilder sb2= new StringBuilder();
                sb1.append("C:\\Users\\LimHoeYeong\\IdeaProjects\\Beakjoon\\example\\"+file_num+".in");
                sb2.append("C:\\Users\\LimHoeYeong\\IdeaProjects\\Beakjoon\\example\\"+file_num+".out");

                File f_in= new File(sb1.toString());
                File f_out= new File(sb2.toString());

                if(!f_in.exists()) f_in.createNewFile();
                if(!f_out.exists()) f_out.createNewFile();

                FileOutputStream fo_in= new FileOutputStream(f_in);
                FileOutputStream fo_out= new FileOutputStream(f_out);

                fo_in.write(((Integer.toString(d))+" "+(Integer.toString(m))+"\n").getBytes());
                fo_out.write((day_string[day]+"\n").getBytes());

                //============================
                day=(day+1)%7;

                //============================
                fo_in.close();
                fo_out.close();

                file_num++;
            }

        }



        /*
        fo_in.write((Integer.toString(1000000)+"\n").getBytes());
        for(int i=0;i<1000000;i++){
            fo_in.write((Integer.toString(1000000)+" ").getBytes());
            //System.out.print(1000000+" ");
        }
        fo_in.write(("\n"+Integer.toString(1)+" "+Integer.toString(1)).getBytes());
        //System.out.println("\n"+1+" "+1);

        fo_in.close();
         */
    }
}
/*

        System.out.println(1000000);
        for(int i=0;i<1000000;i++){
            System.out.print(1000000+" ");
        }
        System.out.println("\n"+1+" "+1);
 */