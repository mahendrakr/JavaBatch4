package functionalInterface;

import java.util.LinkedList;
import java.util.function.Function;

public class EmpFunDemo {
     
	public static void main(String[] args) {
		
		LinkedList<Employee> ls=new LinkedList();
		
	    ls.add(new Employee("Abhay " ,956463423 ,"bhopal", 35000));
	    ls.add(new Employee("bharya" ,534645755,"pune",40000));
	    ls.add(new Employee("akanksha",8785826,"indrapuri",120000));
	    ls.add(new Employee("rakesh " ,956463423 ,"bhopal", 55346));
	    ls.add(new Employee("surya" ,534645755,"pune",45643));
	    ls.add(new Employee("dipali",8785826,"indrapuri",745463));
	    
	    Function <Employee, Integer> fn=e->   {
	    	                         
	    	  int sal = e.salary;
	    	      if(sal>=30000 && sal<=50000) 
	    	    	     return(sal*7/100);
	    	    	   	  
	    	      else if(sal>50000 && sal<70000) 
	    	    	   return(sal*10/100);
	    	      
	    	      else if (sal>70000)
	    	    	     return (sal*9/100);
	    	      else return(sal*15/100);
               };
              
              for(Employee e:ls) {
            	 fn.apply(e);
            	 System.out.println(e.ename +"    "+e.salary);
            	 System.out.println("Employee bonus:-"+fn.apply(e));
              }
}
}