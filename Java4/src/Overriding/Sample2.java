package Overriding;

 class Sample2 extends Sample1{
	
    public void firstMethod(){
		
		System.out.println("child class firstMethod");
	}
	
	public String secondMthod(String s1){
		
		System.out.println("child class secondMethod");
		return s1;
		
	}
	
	public char thirdMethod(char c1){
		
		System.out.println("child class charMthod");
		return c1; 
		
	}

}
