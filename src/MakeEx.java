import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MakeEx {
    public static void main(String[] args)throws IOException{
        File f= new File("A.txt");
        if(!f.exists()) f.createNewFile();
        FileOutputStream fo= new FileOutputStream(f);


        fo.write((Integer.toString(1000000)+"\n").getBytes());
        for(int i=0;i<1000000;i++){
            fo.write((Integer.toString(1000000)+" ").getBytes());
            //System.out.print(1000000+" ");
        }
        fo.write(("\n"+Integer.toString(1)+" "+Integer.toString(1)).getBytes());
        //System.out.println("\n"+1+" "+1);

        fo.close();
    }
}
/*

        System.out.println(1000000);
        for(int i=0;i<1000000;i++){
            System.out.print(1000000+" ");
        }
        System.out.println("\n"+1+" "+1);
 */