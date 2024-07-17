import java.io.*;

public class CheckedExceptionsExample extends Throwable {
    public CheckedExceptionsExample(String string) {

    }

    public static void main(String[] args) throws IOException {
        File file = new File("text1.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String string = bufferedReader.readLine();


            String[] numbers = string.split(" ");
            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);


            comparison(firstNumber, secondNumber);

        } catch (IOException | CheckedExceptionsExample e) {
            System.out.println("Произошла ошибка");
        }
    }

    public static void comparison(int firstNumber, int secondNumber) throws CheckedExceptionsExample {
        if (firstNumber < secondNumber) {
            throw new CheckedExceptionsExample("Второе число " + secondNumber + "больше первого " + firstNumber);
        } else {
            System.out.println("Второе число " + secondNumber + " меньше первого " + firstNumber);
        }

    }
}