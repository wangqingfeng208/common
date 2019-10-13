package com.wangqingfeng.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


/**
 * @作者 王清锋
 * 2019年10月11日
 * 
 *	流处理工具类
 */
public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ... autoCloseable/*传递过来的参数为1个或数组*/){
	//TODO 实现代码
		//判断参数是否有值
		if(autoCloseable != null && autoCloseable.length > 0) {
			//遍历实现批量关流
			for (AutoCloseable ac : autoCloseable) {
				try {
					ac.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
	//TODO 实现代码
		//定义一个空字符串，用于接收文本内容
		String str = "";
		//提高传输效率
		byte[] b = new byte[1024];
		//
		int x = 0;
		try {
			while((x=src.read(b)) != -1) {
				str += new String(b, 0, x, "UTF-8");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(src);
		}
		return str;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
	//TODO 实现代码
		try {
			FileInputStream fis = new FileInputStream(txtFile);
			return readTextFile(fis);
		} catch (FileNotFoundException e) {
			// T1ODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
