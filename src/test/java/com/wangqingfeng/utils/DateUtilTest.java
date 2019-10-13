package com.wangqingfeng.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * @作者 王清锋
 * 2019年10月11日
 * 
 */
public class DateUtilTest {

	/**
	 * Test method for {@link com.wangqingfeng.utils.DateUtil#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {
		Date date = new Date();
		Date d = DateUtil.getDateByInitMonth(date);
		String str = DateUtil.getStringByDate(d);
		System.out.println(str);
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.DateUtil#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		Date date = new Date();
		Date d = DateUtil.getDateByFullMonth(date);
		String str = DateUtil.getStringByDate(d);
		System.out.println(str);
	}
	/**
	 * 拼接下面根据时间范围查询订单的SQL：
	 * String sql = "select * from t_order where create_time>='{1}'
 	 * and create_time<='{2}' ";
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
	 * 
	 */
	@Test
	public void testSQl() {
		//月初
		Date initMonth = DateUtil.getDateByInitMonth(new Date());
		//月末
		Date fullMonth = DateUtil.getDateByFullMonth(new Date());
		String sql ="select * from t_order where create_time>='{1}' and create_time<='{2}'";
		//替换后的结果
		sql = sql.replace("{1}", DateUtil.getStringByDate(initMonth));
		sql = sql.replace("{2}", DateUtil.getStringByDate(fullMonth));
		System.out.println(sql);
	
	}
	@Test
	public void testGetDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		Date date = DateUtil.getDate(c.getTime(), new Date());
		System.out.println(date);
	}
}
