package STRING;

public class Stringfunctions {
	public static void main(String[] args) {
		String s1="Quantum Academy";
		String s4="software testing";
		String s3="Quantum Academy";
		String s2=new String("Quantum Academy");
		String s5=new String("QUANTUM ACADEMY");
		String s6=new String("quantum academy");
		String s7="";
		String s8=" ";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s6));
		
		System.out.println(s1.equalsIgnoreCase(s6));
		
		System.out.println(s1.length());
		
		System.out.println(s5.toLowerCase());
		System.out.println(s6.toUpperCase());
		
		System.out.println(s1.contains("a"));
		
		System.out.println(s1.concat(s4));
		
		System.out.println(s4.startsWith("so"));
		System.out.println(s4.endsWith("g"));
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s4.substring(9));
		System.out.println(s4.substring(0, 8));
		
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf("Academy"));
		
		System.out.println(s1.replace('A', 'a'));
		System.out.println(s1.replaceFirst(s1, s4));
		System.out.println(s2.replaceAll("a", "A"));
		
		System.out.println(s1.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s8.isEmpty());
		
		System.out.println(s7.isBlank());
		System.out.println(s8.isBlank());
		
	}

}
