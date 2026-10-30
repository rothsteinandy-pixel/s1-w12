public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s=s.substring(1);
        count ++;
      }
      return count;
    }
  
    public String copy(String s, int num){
      String f = "";
      while(num > 0){
        f += s;
        num --;

      }
      return f;
    }
  
    public String interweaving(String s1, String s2){
      String f = "";
      int x = 0;
      while(x<s1.length()){
        f = f + s1.substring(x, x+1) +s2.substring(x,x+1);
        x++;}
      return f;
    }
  
  
  }