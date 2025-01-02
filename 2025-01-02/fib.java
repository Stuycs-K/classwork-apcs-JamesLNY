import java.util.Scanner;

// 46 is the largest n such that fib(n) fits in an int and it is also the largest fibonacci number that can be calculated in under 10 seconds.

public class fib {
  public static int fib(int n) {
    if (n < 2) return n;
    return fib(n - 1) + fib(n - 2);
  }
  public static void main(String[] args) {
    System.out.println(fib(Integer.valueOf(args[0])));
  }
}
