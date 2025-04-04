package Chap18;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("now date: " + now);
        System.out.println("now time: " + now.getTime());

        Date past = new Date(1710756131614L);
        System.out.println("past date: " + past);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String strNow = sdf.format(now);
        System.out.println("format now date: " + strNow);
    }
}
