package com.jisheng;

/**
 * -XX:+PrintFlagsInitial(打印虚拟机初始化默认值)
 * 
 *
 */
/**
 * -XX:+TraceClassLoading:跟踪类加载过程
 * -XX:+TraceClassLoadingPreorder:跟踪类加载之前 过程
 * -XX:+TraceClassInitialization:跟踪类初始化过程(开发版本才能用)
 * -XX:+TraceClassResolution:跟踪常量池解析过程
 */

/**
 * 
 * @author jisheng
 *
 */
public class T5 {
	public static void main(String[] args) { 
		Demo demo = new Demo();
		for (int i = 0; i < 1; i++) {
			demo.show();
			
		}
	}
	

}
