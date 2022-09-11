package p1;

import p2.C;

public class B {
	public static void main(String[] args) {
		A a1 = new A();
		C c2 = new C();
		c2.test();
		
		System.out.println(a1.i);
		System.out.println(c2.j);
		
	}

}
