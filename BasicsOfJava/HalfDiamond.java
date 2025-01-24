public class HalfDiamond{

  public static void halfDiamond(int n){
    // rows
    for(int i = 1; i <= n; i++){
      
      // spaces
      for(int j = 1; j <=n-i; j++){
        System.out.print(" ");
      }

      // stars
      for(int k = 1; k <= (2*i-1); k++){
        System.out.print("*");
      }

      System.out.println();
    }
  }


  public static void main(String[] args) {
    halfDiamond(4);
  }
}