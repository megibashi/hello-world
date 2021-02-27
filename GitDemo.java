/*****
 Megi Bashi
 ******/
public class GitDemo {
    
    private double previousNumber;
    private double reverseNum;
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        double sum = sum(num, previousNUmber); 
        System.out.print("Add num to previousNumber" + sum);
        return 0;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
        double newNumber = 1;
        
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
        }
        
        return newNumber;
    }
   
    
  
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
 v2_branch2
    public double reverseNumber(int num) {
        double factorialNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            factorialNumber = factorialNumber * 10 + temp;
            num /= 10;
        }
  public double reverseNumber(int num){
        double newNumber = 1;
        reverseNum = newNumber;
        for(int i = 1; i <= num; ++i){
            double digit = num % 10;
            newNumber = newNumber * 10 + digit;
            newNumber /= 10;
        } 
 main
        
        return factorialNumber;
    }
    
 v2_branch2
} 

}
 main
