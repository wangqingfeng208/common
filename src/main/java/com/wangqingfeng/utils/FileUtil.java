package com.wangqingfeng.utils;

import java.io.File;

/**
 * @作者 王清锋
 * 2019年10月11日
 * 
 * 	文件工具类
 */
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
	//TODO 实现代码
		//判断传过来的文件名是否是空
		if(fileName != null && fileName != "") {
			//根据最后一次出现的.进行切割
			String str = fileName.substring(fileName.lastIndexOf("."));
			return str;
		}else {
			return null;
		}
	}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
	//TODO 实现代码
		String str = System.getProperty("java.io.tmpdir");
		return new File(str);
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
	//TODO 实现代码
		String str = System.getProperty("user.home");
		return new File(str);
	}

}
