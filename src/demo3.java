

/**
 * Created by Administrator on 2018/10/26 0026.
 */
public class demo3 {
    public static void main(String[] args) {
        String toolingNo ="Z2-Coating-AAD-0111";
        //获得第一个点的位置
        int index=toolingNo.indexOf("-",3);
        System.out.println(index);
        //根据第一个点的位置 获得第二个点的位置
        index=toolingNo.indexOf("-", index+1);
//        index=toolingNo.indexOf("-", index+1);
        System.out.println(index);
        //根据第二个点的位置，截取 字符串。得到结果 result
        String result=toolingNo.substring(0,index);
        //输出结果
        System.out.println(result);

        int index1=toolingNo.indexOf("-",1);
        int index2=toolingNo.indexOf("-",index1+1);
        String result1=toolingNo.substring(index1+1,index2);
        //输出结果
        System.out.println(result1);

    }
}
