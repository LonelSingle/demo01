import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by Administrator on 2018/11/23 0023.
 */
public class demo5 {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar();
        System.out.println("当时日期是:"+calendar.getTime());
        calendar.add(Calendar.DATE, -30);
        System.out.println("30天前是:"+calendar.getTime());
        System.out.println(LocalDate.now());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String operationDate1 = simpleDateFormat.format(calendar.getTime());
        System.out.println(operationDate1);
        String a="12";
        System.out.println(a.substring(1,2));
//        Date operation = simpleDateFormat.parseObject(operationDate1);

    }
}
