package BasicsOfJava;

public class PrintNO {
  public static void main(String args[]){
    for (int i = 0; i < 10; i++) {
      System.out.println(i+1);
    }
    int i = 1, sum=0;
    while (i <= 10) {
      System.out.println(sum += i);
      i++;
    }
  }
}
