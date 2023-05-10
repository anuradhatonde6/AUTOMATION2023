package constructor;

public class example1 {
	public static void main(String[] args) {
		example1 ex1=new example1();
		example1 ex2=new example1 (10);
		example1 ex3=new example1(10.0f,10.0f);
		
	}
example1()
{
	System.out.println("calling user defined constructor");
	}
example1(int a)
{
	System.out.println("calling parametrized constructor");
	}
example1(float f1,float f2)
{
	System.out.println("Addition:"+(f1+f2));
	}

}
