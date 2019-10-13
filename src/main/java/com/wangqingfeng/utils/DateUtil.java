package com.wangqingfeng.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @作者 王清锋
 * 2019年10月11日
 * 
 * 	日期工具类
 */
public class DateUtil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
	//TODO 实现代码
		//日历类
		Calendar calendar = Calendar.getInstance();
		//将传入的日期进行日历化
		calendar.setTime(src);
		//将日期调整为1日
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		//将小时调整为0时
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		//将分钟调整为0分
		calendar.set(Calendar.MINUTE, 0);
		//将秒调整为0秒
		calendar.set(Calendar.SECOND, 0);
		//将日历转化为Date对象然后返回
		return calendar.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
	//TODO 实现代码
		//日历类
		Calendar calendar = Calendar.getInstance();
		//将传入的日期进行日历化
		calendar.setTime(src);
		//将月份加1
		calendar.add(Calendar.MONTH, 1);
		//将修改过的日历转换为date，调用上一个方法获得其月份的第一日的0时0分0秒
		Date date = getDateByInitMonth(calendar.getTime());
		//将此时间转换为日历时间
		calendar.setTime(date);
		//将其秒数减1
		calendar.add(Calendar.SECOND, -1);
		//返回最初时间所在月的最后时间
		return calendar.getTime();
	}
	/**
	 * 	方法3
	 * 	将传过来的日期转换成指定类型的String类型
	 */
	public static String getStringByDate(Date src) {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(src);
		return str;
	}
	/**
	 * 	返回个在minDate和maxDAte之间的随机日期
	 */
	public static Date getDate(Date minDate ,Date maxDate) {
		//1970年至指定最小日期的毫秒数为最小毫秒数
		long min = minDate.getTime();
		//1970年至指定最大日期的毫秒数为最大毫秒数
		long max = maxDate.getTime();
		//在最大值和最小值之间随机一任意数为随机毫秒数
		long x =(long) ((Math.random() * (max -min +1)) +min);
		//将随机毫秒数转换为Date时间并返回
		return new Date(x);
	}
	/**
	 * 	根据生日计算年龄
	 * 
	 */
	public static int getAge(Date birthday) {
		// 获取当前系统的日历类
		Calendar c = Calendar.getInstance();
		// 获取当前年月日
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		// 用生日初始化日历类
		c.setTime(birthday);
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);
		// 年龄 1990-02-10 2019-02-08
		int age = yearNow - yearBirth;
		// 出生月份大于前月份 年龄减少1
		if (monthBirth > monthNow) {
			age--;
		}
		// 如果月份一致并且 日期大于当前日期 年龄减少1
		if (monthBirth == monthNow && dateBirth > dateNow) {
			age--;
		}
		return age;
	}
}
