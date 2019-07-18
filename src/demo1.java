import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/10/11 0011.
 */
public class demo1 {

    public static void main(String[] args) {
        float minco1=(float)(10212153.0/1000);
        float minco2=(float)(Math.round(minco1*10))/10;
        System.out.println(minco1);
        System.out.println((float)(Math.round(minco1*10))/10);
        float minco3 =Float.parseFloat("11.9") ;
        for(int i = 0;i<minco3;i++){
            minco3=minco3-Float.parseFloat("0.1");
            System.out.println(minco3);
        }
        float minco4 =Float.parseFloat("11.9")-Float.parseFloat("0.1") ;
        System.out.println(minco4);
        BigDecimal totalFeeDecimal = new BigDecimal("11.9");
        BigDecimal totalFeeAfterDecimal = new BigDecimal("0.1");
        float result = totalFeeDecimal.subtract(totalFeeAfterDecimal).floatValue();
        System.out.println(result);
        System.out.println(totalFeeDecimal);
        System.out.println(totalFeeAfterDecimal);

    }
}
