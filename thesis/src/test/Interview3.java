package test;



public class Interview3 {

	public static int n = 200;
	public static void main(String[] args) {

//		generating the first n Fibonacci numbers F(n), printing ...
//		- ... "Buzz" when F(n) is divisible by 3.
//		- ... "Fizz" when F(n) is divisible by 5.
//		- ... "BuzzFizz" when F(n) is prime.
//		- ... the value F(n) otherwise.

		 
		
		int N = n; long tmp = 0;
		 
		// 3, 5 are Prime, so it needs to check prime first
		 for (int i = 1; i < 6; i++){
         	tmp = fibo(i);
         		 if (tmp!=1 && isPrime(tmp) == true) {
         			System.out.println("FizzBuzz");
         			}
         		 else if (tmp % 3 == 0) {
		                System.out.println("Buzz");
		            } else if (tmp % 5 == 0) {
		                System.out.println("Fizz");
		            }	  else {
		                System.out.println(String.valueOf(tmp));
		            }
         	 
		        }
		 
		 for (int i = 6; i < N; i++){
			 
            	tmp = fibo(i);
            	if(tmp >Long.MAX_VALUE || fibo(i)<0)
        			break;
            	
		            if (tmp % 3 == 0) {
		                System.out.println("Buzz");
		            } else if (tmp % 5 == 0) {
		                System.out.println("Fizz");
		            }	
		                else if (isPrime(tmp) == true) {
		                System.out.println("FizzBuzz");
		            } 
		                else {
		                System.out.println(String.valueOf(tmp));
		            }
            	 
		        }
        
}
	
	static long fibo(long n){
		 if(n <= 1){
		  return n;
		 }
		 long fibo = 1;
		 long fiboPrev = 1;
		 for(int i = 2; i < n; ++i){
		  long temp = fibo;
		  fibo += fiboPrev;
		  fiboPrev = temp;
		 }
		 if(Long.MAX_VALUE < fibo)
     		return 0;
		 return fibo;
		}
	
	static boolean isPrime(long n) {
		if (n == 2 || n == 3)
	        return true;	     
	    if (n % 2 == 0 || n % 3 == 0)
	        return false;
	    long i = 5;
	    long w = 2;	    
	    while (i * i <= n){	    	 
	        if (n % i == 0)
	            return false;	        
	        i += w;
	        w = 6-w;
	    }
		return true;
	}
}