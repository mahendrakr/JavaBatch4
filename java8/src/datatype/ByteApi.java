package datatype;

public class ByteApi {

	public static void main(String[] args) {
    System.out.println(Byte.SIZE);
     byte b=20;
     Byte b1 = Byte.valueOf(b);
     System.out.println(b1);
//     public static byte parseByte(String s, int radix)
     String s1="120";
    // byte parseByte = Byte.parseByte(s1, 2);
     //System.out.println(parseByte);
     //Byte.parseByte("130", 6);
     //public static byte parseByte(String s)
      String s2="120";
       Byte b2=Byte.parseByte(s1);
       System.out.println(b2);
       //public static Byte valueOf(String s)
       
       String str="140";
       Byte b3 = Byte.valueOf(str);
       System.out.println(b3);
      
      
     
	}

}
