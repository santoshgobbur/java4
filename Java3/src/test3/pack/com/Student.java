package test3.pack.com;

public class Student {
	
	String name;
	int rollnum;
	
	Student(String name, int rollnum)
	{
		this.name = name;
		this.rollnum = rollnum;
		
		System.out.println(this.name);
		System.out.println(this.rollnum);
		
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("durga",101);
		Student s2 = new Student("Ravi",102);
		Student s3 = new Student("Ram",103);
		
	}

}
