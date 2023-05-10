package collection;

import java.util.ArrayList;
import java.util.Collection;

public class _ArrayList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Quantam Academy");
		al.add('A');
	    al.add(true);
	    al.add(null);
	    al.add(45.50f);
	    al.add(100);
	    al.add(null);
	    al.add(100);
	    System.out.println(al);
	    System.out.println(al.get(1));
	    System.out.println(al.contains(200));
	    System.out.println(al.size());
	    System.out.println(al.isEmpty());
	    al.set(3,200);
	    System.out.println(al);
	    al.remove(6);
	    System.out.println(al);
	    for(int i=0;i<al.size()-1;i++)
	    {
	    	System.out.println(al.get(i));
	    }
	    
	}

}
