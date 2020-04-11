import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 số nguyên:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(checkFizzBuzz(number));
    }

    public static String checkFizzBuzz(int number){
        String result = "";
        if (number % 3 == 0){
            result += "Fizz";
        }
        if (number % 5 == 0){
            result += "Buzz";
        }
        if ( number % 5 != 0 && number % 3 != 0){
            result += number;
        }
        return result;
    }
}
