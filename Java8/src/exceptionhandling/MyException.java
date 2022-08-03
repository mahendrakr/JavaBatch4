package exceptionhandling;

public class MyException extends RuntimeException {
	public MyException(String error) {
		super(error);
	}

	public MyException(Throwable th) {
		super(th);

	}

	public MyException(String msg, Throwable th) {
		super(msg, th);
	}
}
