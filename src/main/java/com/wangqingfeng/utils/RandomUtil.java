package com.wangqingfeng.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * @作者 王清锋
 * 2019年10月12日
 * 
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
	//TODO 实现代码
		/*
		 * double random = Math.random(); 
		 * int x = (int) Math.floor(random*max -1 +min)+1; 
		 * return x;
		 */
		Random random = new Random();
		int x = random.nextInt(max - min + 1) + min;
		return x;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
	//TODO 实现代码
		HashSet<Integer> set = new HashSet<Integer>();
		int arr[] = new int[subs];
		while(set.size() != subs) {
			int x = random(min, max);
			set.add(x);
		}
		int i = 0;
		for (int x : set) {
			arr[i] = x;
			i++;
		}
		return arr;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
	//TODO 实现代码
		String str = "123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char charAt = str.charAt(random(0, str.length()-1));
		return charAt;
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
	//TODO 实现代码
		String str = "";
		for (int i = 0; i < length; i++) {
			str += randomCharacter();
		}
		return str;
	}


}
