import java.util.Date;

/**
 * Created by Administrator on 2019/2/19 0019.
 */
public class ComputingTime {
    public static void main(String[] args) {
        Double preSumTime= new Date().getTime()-1.8*60*60*1000;
        Double preTime =(new Date().getTime()-preSumTime)/(60*60*1000);
        long sumTime=new Date().getTime()/(60*60*1000);


        long mss = (long) ((0.017673611111111112) * 3600 * 24);
        long days = mss / (60 * 60 * 24);
        long hours = (mss % (60 * 60 * 24)) / (60 * 60);
        long minutes = (mss % (60 * 60)) / (60);
        long seconds = (mss % (60));
        String str = days + "天 " + hours + " 小时 " + minutes + " 分 " + seconds + " 秒 ";
        Date date = new Date();
        System.out.println(date);



    }
}
