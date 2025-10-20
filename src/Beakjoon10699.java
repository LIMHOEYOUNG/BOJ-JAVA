import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Beakjoon10699 {
    public static void main(String[] args){
        Date today = new Date();
        SimpleDateFormat today_format_change = new SimpleDateFormat("yyyy-MM-dd");
        //today_format_change.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(today_format_change.format(today));
    }
}
