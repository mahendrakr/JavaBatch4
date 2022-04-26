package operator;
/** Note----> (==)Operator
 * i> you can apply equality operator on all primitive data type and it will compare content.
 *  ii> you can also apply equality operator on reference type.
 *  for eg: String s1="Aadi";
            String s2="Aadi";
            s1==s2 ----> It will compare addresses of the objects.AND if you want to compare content of the reference type then 
            you have to use equals() methods.
            for eg:System.out.println(s3.equals(s4));
 * TODO instanceof Operator will be discuss in inheritance topic.
 * 
 *
 */

public class Equalityoperator {

	public static void main(String[] args) {
     boolean b1=true;
     boolean b2=true;
     System.out.println(b1==b2);
     String s1="Aadi";
     String s2="Aadi";
     System.out.println(s1.hashCode() + " " + s2.hashCode());
     System.out.println(s1==s2);
     String s3=new String("Aadi");
     String s4=new String("Aadi");
     System.out.println(s1==s3);
     System.out.println(s3==s4);
     //TODO SUBODH
     System.out.println(s3.equals(s4));
     
    }

}