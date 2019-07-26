import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Administrator on 2018/11/23 0023.
 */
public class demo4 {
    public static void main(String[] args) {
        String lotId="QWERH180926B2504YDW";
        String lotId1="QWERH180926B2504";
//        if(lotId.length()<23){
//            int length=23-lotId.length();
//            for(int i=0;i<length;i++){
//                lotId="0"+lotId;
//            }
//            System.out.println(lotId);
//            System.out.println(lotId.substring(8,lotId.length()-1));
//        }
        String l = lotId.substring(lotId1.length());
        System.out.println(l);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
        Date dateNow = null;
        Date date = null;
        try {
            dateNow=sdf.parse(new Date().toString());
            date=sdf.parse("Tue Mar 21 13:45:45 CST 2019");
            double a=Double.valueOf(4);
            double f1 = new BigDecimal((float)a/24).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
            double time=dateNow.getTime()-date.getTime();
            double f2 = new BigDecimal((float)time/(24*1000*3600)).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
            double leftTimes=f2-f1;
            System.out.println("f1="+f1);
            System.out.println("seconds="+time);
            System.out.println("f2="+f2);
            System.out.println("leftTimes="+leftTimes);
        }catch (Exception e){
            e.getStackTrace();
        }
        double a=4;
        double b=24;
        double f1 = new BigDecimal((float)a/b).setScale(10, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("ddd="+f1);



        String beginTime=new String("2017-06-09 10:22:22");
        String endTime=new String("2017-06-09 11:22:22");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date sd1=df.parse(beginTime);
            Date sd2=df.parse(endTime);

            System.out.println(sd1.before(sd2));
            System.out.println(sd1.equals(sd2));
            System.out.println(sd1.after(sd2));
        }catch (Exception e){
            e.getStackTrace();
        }




    }
}
