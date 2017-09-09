package com.scp.basic;

 class Test1 {
        int x=20;
        static int y=10;
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.x = 88;
		t1.y = 99;
		
		Test1 t2 = new Test1();
		System.out.println(t2.x +"..." + t2.y);

	}

}
