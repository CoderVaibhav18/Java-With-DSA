public class ButterflyPattern {

  public static void butterflyPattern(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
// bbb
      for(int k = 1; k <= 2*(n-i); k++){
        System.out.print(" ");
      }

      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }

      System.out.println();
    }

    for(int i = n; i >= 1; i--){
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }

      for(int k = 1; k <= 2*(n-i); k++){
        System.out.print(" ");
      }

      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void main(String[] args){
    butterflyPattern(4);
  }
}
