package com.jisheng;

/**
 * 
 * @author Administrator
 *JVM参数：更改栈空间的大小
 *	-Xss128k
 *	-Xss1024k
 */
public class T4 {
	static int count = 0;

	static void show() {
		count++;
		show();
	}

	public static void main(String[] args) {
		try {
			show();
		} catch (Throwable e) {
			System.out.println(count);
			e.printStackTrace();
		}

	}

}
