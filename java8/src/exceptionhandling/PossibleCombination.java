package exceptionhandling;
/** 1: Explain exception hierarchy .
 *  2: What is checked and unchecked exception?explain  with example.
 *  3: when we should use checked or unchecked expection?
 *  4: what is the difference between final ,finally, and finalize().
 *     
 */
import java.io.FileNotFoundException;
public class PossibleCombination {
public void method() {
	try {
	} catch (NullPointerException e) {
	} 
	
	try {
	} catch (RuntimeException e) {
	}
	
	try {
	} catch (Error e) {
	}
	
	try {
	} catch (Exception e) {
	}
	try {
	} catch (Throwable e) {
		
	}
	try {
		throw new FileNotFoundException();
		
	}catch(FileNotFoundException e) {}
	
//try {}catch(FileNotFoundException e) {}//CE For checked exception it must be raised in the try block then only you can handle it.
try {}catch(RuntimeException e) {}catch(Exception e) {}
//try {}catch(NullPointerException e) {}catch(NullPointerException e) {}//CE you can't handle same exception two times.
try{}catch(Exception e) {}finally{}
//try{}finally{}catch(Exception e) {}//CE in catch, finally series finally block should be the last block.
//try {}catch(RuntimeException e) {}catch(NullPointerException e) {}//CE if there is a relation between the exceptions then first child exception should be handled first then parent.
try {}catch(NullPointerException e) {}catch(RuntimeException e) {}
try {}finally {}
//try {}finally {}finally {}//CE atmost one finally block is  allowed.  
}
}
