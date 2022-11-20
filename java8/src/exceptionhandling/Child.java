package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent{
	@Override
	public void m1() throws RuntimeException{
		System.out.println("child m1");
	}
	
	

}
