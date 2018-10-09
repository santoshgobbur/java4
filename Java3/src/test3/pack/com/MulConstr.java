package test3.pack.com;

public class MulConstr {
	
	MulConstr()
	{
	  this(15);	
	  System.out.println("No-arg Constructor ");	
	}
	MulConstr(int i)
	{
	  this(15.16); 	
	  System.out.println("int-arg Constructor ");	
	}

	MulConstr(double i)
	{
	  System.out.println("double-arg Constructor ");	
	}


	public static void main(String[] args) {
		
	    MulConstr m1 = new MulConstr();
	    MulConstr m2 = new MulConstr(6);
	    MulConstr m3 = new MulConstr(5.5);
	    MulConstr m4 = new MulConstr(15l);
	    
	}

}
