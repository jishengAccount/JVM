package com.jisheng;

/**
 * 关闭逃逸分析，关闭标量替换
 * 关闭线程本地内存，打印GC信息
 * @author Administrator
 *
 */
public class T1 {
	public static void main(String[] args) {
		T1 t1=new T1();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			t1.show(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	class User{
		String name;
		int id;
		User(String name,int id){
			this.name=name;
			this.id=id;
		
		}
	}
	void show(int id){
		new User("name"+id,id);
	}
}
