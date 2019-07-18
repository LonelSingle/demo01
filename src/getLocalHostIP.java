import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2019/3/27 0027.
 */
public class getLocalHostIP {
    public static void main(String[] args) {
        try
        {
            Date date=new Date();
            System.out.println(date);
            SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy/MM/dd HH:mm");
            String newExpiryDate = simpleDateFormat.format(date);
            System.out.println(newExpiryDate);

            Date d = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(d);
            int min = (int) (Double.parseDouble("3.9") * 60);
            calendar.add(Calendar.MINUTE, min);
            Date time1=calendar.getTime();
            String time=simpleDateFormat.format(time1);
            System.out.println(time);

            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(d);
            int min1 = (int) (Double.parseDouble("4") * 60);
            calendar1.add(Calendar.MINUTE, min1);
            Date time2=calendar1.getTime();
            String time3=simpleDateFormat.format(time2);
            System.out.println(time3);

            System.out.println(InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
