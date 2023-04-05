import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class LeapYear{

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0){
            return true;
        }if (year % 4 == 0 && year % 10 != 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("LeapYear" + " ");
        int inputyear = scanner.nextInt();
        LeapYear Inputyear = new LeapYear();
        boolean x = isLeapYear(inputyear);     
         //调用方法这里卡了很久。有想过用x.isLeapYear(year)完全错误呢，不是实例方法呢牛头不对马嘴。
         //有想过用定义一个新的leap year类，但输入一行LeapYear.isLeapYear()后不知道怎么使用返回的布尔值。
         //最后一想你isLeapYear不就是个布尔类型不，直接调用就好了。
        if(x = true){
            System.out.println(inputyear + " is a leap year.");
        }else{
            System.out.println(inputyear + " is not a leap year.");
        }
        }
}

//卧槽尼玛啊一个typo整劳资半小时，是Boolean不是boleon啊大姐我服了