import java.util.Scanner;

public class Factorial {

  public static int factorial(int n){
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = sc.nextInt();

    int fact = factorial(num);
    System.out.println("The factorial of " + num + " is " +fact);
    

  }
}
