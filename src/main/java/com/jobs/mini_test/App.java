package com.jobs.mini_test;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ){
		System.out.println("-Game rule : A number is Fizz/Buzz if it's divisible by 3/5");
		System.out.println("-New game rule : A number is Fizz/Buzz if it's divisible by 3/5 or if it has 3/5 in it;"
				+ "A number is FizzBuzz if it satisfy above 2 criterias togerther");
		System.out.println("-Note: the parameter named new/New must be attached if you according to the new rule.");
		if(args.length > 0 && args[0].trim().toLowerCase().startsWith("new")){
			newGame();
		}else{
		    defaultGame();
		}
	}
	
    public static void newGame()
	    {
	    	for(int i=1; i<=100;i++){
	    		if((divisibleBy3(i) || has3(i)) && (divisibleBy5(i) || has5(i)) ){
	    			System.out.println("FizzBuzz");
	    			continue;
	    		}if(divisibleBy3(i) || has3(i)){
	    			System.out.println( "Fizz\n" );
	    			continue;
	    		}
	    		if(divisibleBy5(i) || has5(i)){
	    			System.out.println( "Buzz\n" );
	    			continue;
	    		}
	    		System.out.println( i+"\n" );
	    	}
	        
	    }
	  
	  
    public static void defaultGame()
    {
    	for(int i=1; i<=100;i++){
    		if(divisibleBy3(i))
    			System.out.println( "Fizz\n" );
    		else if(divisibleBy5(i))
    			System.out.println( "Buzz\n" );
    		else 
    			System.out.println( i+"\n" );
    	}
        
    }
    
    public static boolean has3(int number){
    	int temp = number;
    	do {
    		int curSingleDigit = temp%10;
    		if(curSingleDigit == 3) 
    			return true;
    		temp = temp/10;
    	}while(temp!=0);
    	return false;
    }
    
    public static boolean has5(int number){
    	int temp = number;
    	do {
    		int curSingleDigit = temp%10;
    		if(curSingleDigit == 5) 
    			return true;
    		temp = temp/10;
    	}while(temp!=0);
    	return false;
    }
    
    public static boolean hasBoth3and5(int number){
    	if(has3(number)&&has5(number))
    		return true;
    	else
    		return false;
    }
    
    public static boolean divisibleBy3(int number){
    	if(number % 3 == 0)
    		return true;
    	else
    	   return false;
    }
    
    public static boolean divisibleBy5(int number){
    	if(number % 5 == 0 )
    		return true;
    	else
    	    return false;
    }
}
