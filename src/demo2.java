




import com.sun.deploy.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/10/25 0025.
 */
public class demo2 {
    public static void main(String[] args) {
        String str="ab*defg";
        System.out.println(str.substring(0,str.indexOf("*")));
        System.out.println(str.substring(str.indexOf("*")+1));
        String qw = "0";
        long qw1 =Long.valueOf(qw).longValue();
        System.out.println(qw1);
    }
    /**
     * 利用正则表达式判断字符串是否是数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("-?[0-9]+\\.?[0-9]*");
        Matcher isNum = pattern.matcher(str);
        boolean a= isNum.matches();
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
}
