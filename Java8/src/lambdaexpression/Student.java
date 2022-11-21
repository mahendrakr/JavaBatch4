package lambdaexpression;
@FunctionalInterface
 interface Demo{
	public void cab(String source ,String destination , int payment);
}
 
class Student {
   public static void main(String[] args) {
	
	   
	   //By lambda Expression
	   Demo dm=(String source ,String destination , int payment)->System.out.println("Source:"+source+" "+"Destination:"+destination+" "+"Payment:"+" "+payment);
        dm.cab("Satna", "Bhopal", 900);
   }
   
}
