package com.core.Collection.List;

class p1{
	public void t1() {
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

class p2{
	public void t2() {
		p1 obj = new p1();
		obj.t1();
	}
}
public class Practice {

	public static void main(String[] args) {
		
		p2 obj1 = new p2();
		obj1.t2();

	}

}
