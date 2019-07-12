package com.jisheng;

import java.util.ArrayList;
import java.util.List;

/**
 * 将堆内存溢出输出到指定文件中
 * @author Administrator
 *JVM参数：
 *	-XX:+HeapDumpOnOutOfMemoryError
	-XX:HeapDumpPath=D:\T3.dump 
	-XX:+PrintGCDetails
	Xms20m
	Xmx20m
 */
/**
 *[PSYoungGen: 5631K->5200K(6144K)]:收集前大小：5631，收集后大小：5200，总大小：6144 
 *
 *-XX:+PrintGCApplicationConcurrentTime
 *-XX:+PrintGCApplicationStoppedTime
 *
 */

/**
 *使用CMS垃圾收集器
 *-XX:+UseConcMarkSweepGC -XX:GCTimeRatio=49 -XX:MaxGCPauseMillis=50 -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:D:\cms.log 
 *
 */
/**
 *使用G1垃圾收集器
 *-XX:+UseG1GC -XX:GCTimeRatio=49 -XX:MaxGCPauseMillis=50 -XX:+PrintGCDetails -XX:+PrintGCDateStamps -Xloggc:D:\G1.log 
 *
 */
public class T3 {
	public static void main(String[] args) {
		List list=new ArrayList();
		for (int i = 0; i < 100000000; i++) {
			T1 t1=new T1();
			list.add(new byte[1024]);
		}
	}
 
}
