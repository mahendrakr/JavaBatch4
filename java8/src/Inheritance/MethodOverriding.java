package Inheritance;
/**Rules for method Overriding.
 * 1.There must be inheritance relation
 * 2.Method name and argument list must be same. in other words method signature must be same.
 * 3.Return type must be same or co-varient(i..e child or parent) return type.
 * 4.TBD --- In exception handling
 * 5.You cannot reduce the scope (Visibility) but you can increase the scope.
 * 6.You cannot override static,private and final method.
 * 
  public final native java.lang.Class<?> getClass(); //no
  public native int hashCode(); //yes
  public boolean equals(java.lang.Object);//yes
  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException; //yes
  public java.lang.String toString(); //yes
  public final native void notify();  //No
  public final native void notifyAll();//no
  public final native void wait(long) throws java.lang.InterruptedException;//no
  public final void wait(long, int) throws java.lang.InterruptedException; //no
  public final void wait() throws java.lang.InterruptedException; //no
  protected void finalize() throws java.lang.Throwable; //yes
 *
 */
public class MethodOverriding {
 @Override
	public int hashCode() {
		return 123;
	}

	public static void main(String[] args) {
		Object obj=new MethodOverriding();
		System.out.println(obj.hashCode());
		
		  
	}

}
