import java.io.*;

public class UncheckedExceptionsExample {
    public static void main(String[] args)  {

        File file = new File("text.txt");

            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String a = bufferedReader.readLine();
                int number = Integer.parseInt(a);

                int sum = calculateInternal(number);

            } catch (IOException e) {
                System.out.println("Все отработано");
            }
        }
        public static int calculateInternal ( int number){
            int sum = 0;

            for (int i = 1; i < number; i++) {
                sum += i;
                System.out.println(sum);
                if (sum > 10000) {
                    throw new RuntimeException("Результат - неудовлетворительно!");
                }
            }

            return sum;
        }
    }












