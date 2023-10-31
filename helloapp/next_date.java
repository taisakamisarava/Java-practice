//3. Ввести три целых числа - день месяц и год, вывести в виде трех чисел дату следующего дня. 

package helloapp;
import static java.lang.Math.max;
import java.util.Scanner;

public class next_date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day  = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month  = scanner.nextInt();
        System.out.print("Введите год: ");
        int year  = scanner.nextInt();
        
        int maxDaysInMonth;
        if (month == 2) {
             if (year % 4 == 0 ) { // любой год,который делится на 4 -- високосный
                maxDaysInMonth = 29;
            } else {
                maxDaysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDaysInMonth = 30;
        } else {
            maxDaysInMonth = 31;
        }
        if (day < maxDaysInMonth) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
        System.out.println(day + "." + month + "." + year);
    }
}
