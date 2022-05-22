package org.statement;

public class Test {
	public void sample() {
		int a=100,b=200,c=100;
		
		if(a>b&&a>c) {
		System.out.println("A is Greater");

	}
	else if (b>a&&b>c) {
		System.out.println("B is Greater");
		
	}
	else if (c>a&&c>b) {
		System.out.println("C is Greater");
	}
	else {
		System.out.println("Give some valid values");
	}
}
	public static void main(String[] args) {
		Test t = new Test();
		t.sample();
		
	}
}
