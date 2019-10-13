package com.wangqingfeng.utils;


import java.io.File;

import org.junit.Test;

/**
 * @作者 王清锋
 * 2019年10月11日
 * 
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.wangqingfeng.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String str = FileUtil.getExtendName("aaa.jpg");
		System.out.println(str);
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		String name = file.getAbsolutePath();
		System.out.println(name);
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		File name = file.getAbsoluteFile();
		System.out.println(name);
	}

}
