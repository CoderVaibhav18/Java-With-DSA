package BinarySearch;

public class PrefixSum {
  
  public static void prefixSum(int[] arr){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int[] prefix = new int[arr.length];

    prefix[0] = arr[0];
    for(int i = 1; i < prefix.length; i++){
      prefix[i] = prefix[i-1] + arr[i];
    }

    for(int i = 0; i < arr.length; i++){
      for(int j = i; j < arr.length; j++){
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

        if(currSum > maxSum){
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max sum = " + maxSum);
  }

  public static void main(String[] args){
    int[] arr = {2, 4, 6, 8, 10};

    prefixSum(arr);
  }
}
