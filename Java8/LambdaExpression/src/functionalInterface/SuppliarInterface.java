package functionalInterface;

import java.sql.Date;
import java.util.function.Supplier;

public class SuppliarInterface {
     public static void main(String[] args) {
		
	  
	Supplier <Double> s=()-> Math.random();
	 System.out.println(s.get());
	}
	
}
