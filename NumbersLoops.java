public class NumbersLoops{
    public NumbersLoops(){
      int x = 0;

      while (x<11){
        // System.out.println(x);
        x++;

      }
      for(int index = 0; index < 11; index++){
        // System.out.println(index);
      }
    }
  
    public int digitSum(int num){
      int sum = 0;
       int x=0;
       while(x<=num){
          sum = sum+ x;
          x++;
         
      }
        
    
      return sum;
    }
  
    public int reverseNum(int num){
      int newNum = 0;
      
      while(num != 0){
        newNum = newNum *10 +num %10;
  
        num = num/10;
       
    
      }

      return newNum;


    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int count = 0;
      while( start<=finish){
        if(start == reverseNum(start)){
          count ++;
          
        }
        start ++;
       
        

      }
       return count;
    }
  
  
  }
