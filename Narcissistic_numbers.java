public class App {   public static void main(String[] args) {
    // 打印100~1000范围内的所有水仙花数
    System.out.println("Narcissistic numbers between 100 and 1000 are: ");
    for (int number = 100; number <= 1000; number++) {
        if (isNarcissistic(number)) {
            System.out.println(number);
        }
    }
}

private static boolean isNarcissistic(int number) {
    int sum = 0, temp = number;
    while (temp != 0) {
        int digit = temp % 10;
        sum += Math.pow(digit, 3);//sum += digit * digit * digit;
        temp /= 10;
    }
    return sum == number;
  }
}
