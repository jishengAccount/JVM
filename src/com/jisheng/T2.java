package com.jisheng;

/**
 * 使用runtime类大致计算内存占用情况
 * @author Administrator
 *JVM参数：
 *	-XX:+PrintGCDetails 
 *	-XX:+DoEscapeAnalysis ：逃逸分析指：在开启栈上分配后，在栈上的对象不能有别的对象指向他
 *	-XX:+EliminateAllocations ：标量替换
 *	1.标量和聚合量
 *	标量即不可被进一步分解的量，而JAVA的基本数据类型就是标量
 *（如：int，long等基本数据类型以及reference类型等），标量的
 *	对立就是可以被进一步分解的量，而这种量称之为聚合量。而在JAVA
 *	中对象就是可以被进一步分解的聚合量。
 *	2.替换过程
	通过逃逸分析确定该对象不会被外部访问，并且对象可以被进一步分解时，
	JVM不会创建该对象，而会将该对象成员变量分解若干个被这个方法使用的
	成员变量所代替。这些代替的成员变量在栈帧或寄存器上分配空间。
	二 、栈上分配
	我们通过JVM内存分配可以知道JAVA中的对象都是在堆上进行分配，当对象
	没有被引用的时候，需要依靠GC进行回收内存，如果对象数量较多的时候，
	会给GC带来较大压力，也间接影响了应用的性能。为了减少临时对象在堆内
	分配的数量，JVM通过逃逸分析确定该对象不会被外部访问。那就通过标量
	替换将该对象分解在栈上分配内存，这样该对象所占用的内存空间就可以随
	栈帧出栈而销毁，就减轻了垃圾回收的压力。


 *	-XX:+UseTLAB
 */
public class T2 {
	public static void main(String[] args) {
		show();
		byte[] b=new byte[1024*1024];
		show();
	}

	static void show() {
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}
