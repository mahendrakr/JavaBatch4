package stringapi;

public class EqualsHashCodeContract {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		s2.concat("kumar");
		System.out.println(s2);
        
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + " " + s2.hashCode());

		String s3 = new String("Sita");
		String s4 = new String("Sita");
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + " " + s4.hashCode());

		StringBuilder sb = new StringBuilder("Alok");
		StringBuilder sb1 = new StringBuilder("Alok");
		System.out.println(sb.equals(sb1));
		
		StringBuffer sb3 = new StringBuffer("rishabh");
		StringBuffer sb4 = new StringBuffer("rishabh");
		System.out.println(sb3.equals(sb4));
		
	    sb3.append(" baghel");
	    System.out.println(sb3);
	    System.out.println(sb3.length());
	    
	    StringBuffer sbu=new StringBuffer("subodh");
	    System.out.println(sbu.capacity());
	    System.out.println(sbu.length());
	    
	}
}
