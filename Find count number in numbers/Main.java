import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int m = 26564654;
      int n = 54, i = 0;
      String newm = Integer.toString(m);
      String newn = Integer.toString(n);
  
      while(true)
      if (newm.lastIndexOf(newn) != -1){
      System.out.println("found!");
       newm =  newm.substring(0, newm.lastIndexOf(newn));
       i++;
      } else
      break;
  
      System.out.println("count:"+ i);
      
  }
}