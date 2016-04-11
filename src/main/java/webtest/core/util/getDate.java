package webtest.core.util;

import java.util.Calendar;

/**
 * Created by Administrator on 2016-04-11.
 */
public class getDate {
    public static String getDate() {
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int monthR = month+1;
        int date = c.get(Calendar.DATE);
        int dateR = date+1;
        String date1 = year + "-" + monthR + "-" + dateR;
        return date1;
    }
    public static String getDateSceond() {
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        String date2 = hour + ":" + minute + ":" + second;
        return date2;
    }
}
