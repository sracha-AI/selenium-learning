package Exceptions;

public class Exceptions_1 {
	
   public void div(int a , int b) {
	  
	   try {
	   int c ;
	   
	   c=a/b;
	
	   System.out.println("print the value : " +  c);
	   System.out.println("print anything");
	   
	   }
   
	   catch (Exception  d)  {
		   
		   System.out.println("Exception occured" + d.getMessage());
		   d.getStackTrace();
		   
		   
	   }
	   finally {
		   System.out.println("try catch finished");
	   }
   }
   
   
   public void div (int a, double b) {
	   
	   try {
		   
		   double c=a/b;
		   System.out.println("print c : "   + c);
		
	} catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
	  
	   
   }
   
  public  void array1(int a[] , double b[]) {
  
	  try {
		
		 System.out.println(a[1] );
		  System.out.println(b[3]);
		  
		  
		  
	} catch (Exception e) {
		
		System.out.println("Index outof boud " + e.getMessage());
	}
	  
	  
	  
	  
  
  }
  
  

   public static void main(String[] args) {
	
	   Exceptions_1 obj1= new Exceptions_1();
	   obj1.div(10, 0);
	   obj1.div(10, 2);
	   obj1.div(10, 0.0);
	   
	   int a[]= {1,2,4,5,5};
	   double b[]= {1.1,2.1,2.0};
	   
	   obj1.array1(a,b);
}
}
