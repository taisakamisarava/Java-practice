/*
2. Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */

package helloapp;
import java.util.Scanner;

public class rubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в рублях: ");
        int amount = scanner.nextInt();
        int lastDigit = amount % 10;
        int preLastDigit = amount % 100;
        String word = "";
        if (lastDigit == 1) {
            word = "рубль";
        } 
        else if ((lastDigit >= 2 && lastDigit <= 4) && (preLastDigit >= 20 && preLastDigit <= 10))  {
            word = "рубля";
        } 
        else if ((lastDigit >= 2 && lastDigit <= 4) && (preLastDigit <= 20 && preLastDigit >= 9))  {
            word = "рублей";
        }
        else {
            word = "рублей";
        }
        System.out.println(amount + " " + word);
    }
}