

import com.sun.deploy.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Administrator on 2018/12/28 0028.
 */
public class Time2change {
    public static void main(String[] args) {

        String receiveDate="Thu May 16 00:00:00 GMT+08:00 2019";

        receiveDate=receiveDate.replace("GMT+08:00","CST");
        System.out.println(receiveDate);

    }
    public Date getCST(String strGMT) throws ParseException {
        DateFormat df = new SimpleDateFormat("EEE, d-MMM-yyyy HH:mm:ss z", Locale.ENGLISH);

        return df.parse(strGMT);
    }

    public String getGMT(Date dateCST) {
        DateFormat df = new SimpleDateFormat("EEE, d-MMM-yyyy HH:mm:ss z", Locale.ENGLISH);
        df.setTimeZone(TimeZone.getTimeZone("GMT")); // modify Time Zone.
        return (df.format(dateCST));
    }
}
