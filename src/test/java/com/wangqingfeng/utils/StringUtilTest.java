package com.wangqingfeng.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @作者 王清锋
 * 2019年10月13日
 * 
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.wangqingfeng.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(" ");
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
		System.out.println(b);
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.StringUtil#randomChineseString(int)}.
	 */
	@Test
	public void testRandomChineseStringInt() {
		String str = StringUtil.randomChineseString(10);
		System.out.println(str);
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.StringUtil#randomChineseString()}.
	 */
	@Test
	public void testRandomChineseString() {
		String str = StringUtil.randomChineseString();
		System.out.println(str);
	}
	
	/**
	 * Test method for {@link com.wangqingfeng.utils.StringUtil#isEmail()}.
	 */
	@Test
	public void testIsEmail() {
		boolean b = StringUtil.isEmail("15122617496@163.com");
		System.out.println(b);
	}
	
	/**
	 * Test method for {@link com.wangqingfeng.utils.StringUtil#isMobile()}.
	 */
	@Test
	public void testIsMobile() {
		boolean b = StringUtil.isMobile("15122617496");
		System.out.println(b);
	}
}
