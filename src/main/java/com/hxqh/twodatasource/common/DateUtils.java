package com.hxqh.twodatasource.common;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Ocean lin on 2017/7/9.
 */
public class DateUtils {

    // 时间格式化
    private static DateFormat dateTimeFormat = null;

    /**
     * 日期格式化yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String getDateTimeFormat(Date date) {
        return dateTimeFormat.format(date);
    }
}
