package exceptionhandling;

public class CustomException extends Exception {

	public CustomException(String error) {
		super(error);
	}

	public CustomException(Throwable th) {
		super(th);
	}

	public CustomException(String msg, Throwable th) {
		super(msg, th);
	}
}