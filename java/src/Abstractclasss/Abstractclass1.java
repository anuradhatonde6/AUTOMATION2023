package Abstractclasss;

public class Abstractclass1 implements abstract1 {
public void test1()
{
	System.out.println("fun test1 completed in implementation class ");
	}
public void test2()
{
	System.out.println("fun test2 completed in implementation class");
	}
public static void main(String[] args) {
	Abstractclass1 a=new Abstractclass1();
	a.test1();
	a.test2();
}
}
