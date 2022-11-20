package pack1;

public class Studenta {
	
	public int sn=4455;
	    String name=" singh solanki";
	    int    age=19;
	    char   gender='m';
	    String facebookId=" singh solanki";
	    
   static   public int Age() 
	    {
	    	return 17;
	    }
    public void beahviour ()
	    {
	    	System.out.println(" have no ...");
	    }
	static	 public void thinking ()
	    {
		System.out.println("soo...  ");
		}
	
              public static void main(String[] args) {
	 Studenta sad=new Studenta ();
	 System.out.println(sad.sn);
	 System.out.println(sad.name);
	 System.out.println(sad.age);
	 Studenta.Age();
	 System.out.println(sad.facebookId);
	 sad.beahviour ();   //non-static call the help of creat of object
	
	 Studenta.thinking();  //static-call with the help of class name.
}
}
