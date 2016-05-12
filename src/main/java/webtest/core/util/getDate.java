package webtest.core.util;

import java.util.Calendar;

/**
 * Created by Administrator on 2016-04-11.
 * 获取当前电脑时间
 */
public class getDate {
    /**
     * 获取电脑时间
     * @return 返回日期格式例如：2016-4-12
     * 注意！注意！！注意！！！这个返回的日期是当前日期的时间加一天因我要用这样的数据所以这样封装的
     * 例如当前系统时间为2016年4月12号，那么返回的数据为：2016-04-13
     */
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
    /**
     * 获取电脑时间
     * @return 返回具体时分秒格式例如：17:36:52
     */
    public static String getDateSceond() {
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        String date2 = hour + ":" + minute + ":" + second;
        return date2;
    }

    /**
     * 获取电脑时间
     * @return 返回日期格式例如：2016-4-12
     */
    public static int[] getTureDate() {
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int monthR = month+1;
        int date = c.get(Calendar.DATE);
        int dateR = date;
        int date2[] = {year,monthR,dateR};
        String date1[] = {String.valueOf(year),String.valueOf(monthR),String.valueOf(dateR)};
        return date2;
    }
}
