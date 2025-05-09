public class BiCoefficeint {

  public static int factorial(int n){
    int fact = 1;
    for(int i = 1; i <= n; i++){
      fact *= i;
    }
    return fact;
  }

  public static int biCoef(int n, int r){
    int a = factorial(n);
    int b = factorial(r);
    int c = factorial(n-r);

    return a/(b*c);
  }

  public static void main(String[] args){
    int n = 5;
    int r = 2;
    int result = biCoef(n, r);
    System.out.println(result);
  }
}
