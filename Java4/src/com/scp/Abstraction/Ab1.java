package com.scp.Abstraction;

public abstract class Ab1 {
	
	static int i;
	final int j=10;
	
    protected abstract void H();
    public abstract void L();
    public final void P(){
    	
    }
    public static void G(){
    	
    }
   // public abstract static void N();
    
}
interface D {
	
	int w=10;
	void M();
	
}
class V implements D{
	
	public void M(){
		System.out.println("h");
	}
}
class F extends Ab1{

	@Override
	protected void H() {
		// TODO Auto-generated method stub
		
	}
	
	public void L(){
		
	}
}