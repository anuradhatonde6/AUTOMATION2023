package constructor;

public class defaultconstructor {
	int a;
	float f1;
	String s1;
	boolean b1;
	public static void main(String[] args) {
		defaultconstructor d=new defaultconstructor();
		d.test1();
	}
public void test1()
{
	System.out.println("running non static method:test1");
	System.out.println("a");
	System.out.println("f1");
	System.out.println("s1");
	System.out.println("b1");
	}
}
