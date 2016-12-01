package Bas.function.super1;

public class superclasstutorial {

	public superclasstutorial() {
		super();// TODO Auto-generated constructor stub
	}
	String hello="Welcome to java";
	public void getmessage()
	{
		System.out.println("superclass"+hello);
	}
	
	public void setmessage(String mess)
	{
		mess=hello;
		System.out.println("superclass"+mess);
	}


}
