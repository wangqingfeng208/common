package com.wangqingfeng.utils;


import org.junit.Test;

/**
 * @作者 王清锋
 * 2019年10月12日
 * 
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.wangqingfeng.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int x = RandomUtil.random(1, 10);
			System.out.println(x);
		}
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		int[] arr = RandomUtil.subRandom(1, 10, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 10; i++) {
			char a = RandomUtil.randomCharacter();
			System.out.println(a);
		}
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(10);
		System.out.println(str);
	}

}
