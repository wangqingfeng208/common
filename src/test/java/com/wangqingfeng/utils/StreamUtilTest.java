package com.wangqingfeng.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * @作者 王清锋
 * 2019年10月13日
 * 
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.wangqingfeng.utils.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 */
	@Test
	public void testCloseAll() {
		
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String str = StreamUtil.readTextFile(new FileInputStream(new File("C:\\Users\\86156\\Desktop\\新建文本文档.txt")));
		System.out.println(str);
	}

	/**
	 * Test method for {@link com.wangqingfeng.utils.StreamUtil#readTextFile(java.io.File)}.
	 */
	@Test
	public void testReadTextFileFile() {
		
	}

}
