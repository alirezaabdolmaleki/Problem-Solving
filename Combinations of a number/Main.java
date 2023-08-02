import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int number = sc.nextInt();
    System.out.println("result is:");

    int temp = number, DivideAmount = 10, lastNum = 0;
    while (true) {

      if (lastNum == number % DivideAmount) 
      break;

      lastNum = number % DivideAmount;
      System.out.print(" " + lastNum);
      
      if (number < DivideAmount) {
        number = temp;
        DivideAmount *= 10;
        System.out.println("");
        continue;
      }
      number /= 10;
    }
  }
}
