package basicOfLambda;

public class Lambdaexpression {

	   /** objective of Lambda expreeion->
	    *       1.-> Functional programing feature.
	    *       2.-> code optimization.
	    *  
	    *  Lambda expression is known as Annonymous function because of-
	        #NO NAME
	        #NO RETURN TYPE
	        #NO ACCESS MODIFIER
	    * 
	    */
	
	/*	
	
	//  EX.->
	   //        NORMAL METHOD 1 :- 
	                     public void m1() {
	                               System.out.println("this is a m1 method"); 
	                     }
	     
	          //LAMBDA EXPRESSION 1 :-
	                            ()->System.out.println("this is a m1 method");
	        
              //NORMAL METHOD 2 :- 
                         public void m2(int x, int y) { 
	                               System.out.println("SUM of x and y is:"+ x+y); 
	                          }
	
	         //LAMBDA EXPRESSION 2 :-
	                      (int x, int y)->System.out.println("SUM of x and y is:"+ x+y); 
	       (NOTE:- No need to define type of variable )
	                      (x,y)->System.out.println("SUM of x and y is:"+ x+y); 
	
	            //NORMAL METHOD 3 :- 
                         public void m3(int x) { 
	                               return (x*x);
                                     }
	
	        (NOTE:-If we have one line statement then no need to given curly braces)
	  
	            //LAMBDA EXPRESSION 3 :-
	                   1.  (int a)->{return(x*x)};
	                   2.   (a)->a*a;
	                   3.    a->a*a;  
	                   
	          (NOTE:-If return statment was present then curly braces is must to given. )          
	                    
	                    few Examples-
	                               n->return n*n;    (invalid lambda expression)
	                               n->{return n*n;}; ( valid)
	                               n->{return n*n};   (invalid lambda expression)
	                               n->{n*n;} ;       ( invalid lambda expression)
	                               n->n*n;            (valid)
	          */
	public static void main(String[] args) {
		
		
	}
}
