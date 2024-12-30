//Write a Java program that uses a for loop to print the first 10 numbers of the Fibonacci sequence.
class _3_fibonacci {
  public static void main(String[] args) {
    int first = 0, second = 1;
    for (int i = 1; i <= 10;i++) {
      System.out.print(first + ", ");

      int sum = first + second;
      first = second;
      second = sum;
    }
  }
}