public class FunctionOverloading {

  // public static int sum(int a, int b){
  //   return a+b;
  // }
  // public static int sum(int a, int b,int c){
  //   return a+b+c;
  // }

  public static int sum(int a, int b){
    return a+b;
  }
  public static float sum(float a, float b){
    return a+b;
  }
  public static void main(String[] args){
    //using parameter anf data type
    System.out.println(sum(5,5));
    System.out.println(sum(5.9f,3.5f));
    // System.out.println(sum(5,5, 5));
  }
}
