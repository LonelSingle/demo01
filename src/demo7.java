import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/4/19 0019.
 */
public class demo7 {

    public static void main(String[] args) {
        Float i=12.235f;
        String str=new BigDecimal(i+"").toString();
        BigDecimal bd2 = new BigDecimal(i);
        double a=10.0331291;
        double b=30.120112;
        b=a+b;
        System.out.println(bd2.toPlainString());
        System.out.println(str);
        NumberFormat nf = NumberFormat.getInstance();
        //设置保留多少位小数
        nf.setMaximumFractionDigits(20);
        // 取消科学计数法
        nf.setGroupingUsed(false);
        String s=nf.format(i);
        System.out.println(s);
        float m=0.9f;
        float n=0.1f;
        Float f2=m-n;
        BigDecimal m1 = new BigDecimal(Float.toString(m));
        BigDecimal n1 = new BigDecimal(Float.toString(n));
        Float f1 = m1.subtract(n1).floatValue();
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        List<String> lms=new ArrayList<String>();
        lms.add("Z1");
        lms.add("Z2");
        lms.add("Z3");
        if(lms.contains("Z2")){
            System.out.println("包含");
        }
    }
}
