/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Apr 2018
 * Created for: learning
 * 
 * This program gets factorial of integer using Recursion
 ****************************************************************************/



public class Factorial{
	//prints out sentence backwards using recursion

    //--------------------------
	public int getFactorial(int inputNum) {   
    	//this is a recursive procedure printing out the sentence backwards
    	
    	int oneLessNum, result;
    
    	 if (inputNum==0 || inputNum==1) {
    		 //if factorial is 1
    		 return 1;
    	 } else {
    		 //if other factorial
    		 oneLessNum = inputNum-1;
    		 
    		 result = getFactorial(inputNum-1) * inputNum;
    	 }

    	 return result;
    }
	
    //--------------------------
	public static void main(String[] args) {
    	//reverses string
		Factorial obj=new Factorial(); //call the same class
        
        System.out.println("The factorial of \'3\' is \'"+obj.getFactorial(3)+"\'.");   
        System.out.println("The factorial of \'4\' is \'"+obj.getFactorial(4)+"\'.");  
        System.out.println("The factorial of \'5\' is \'"+obj.getFactorial(5)+"\'.");  
    }    
}

