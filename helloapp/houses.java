//Д4.Есть участок размером a на b и два дома размерами c на d и e на f.
//определить, поместятся ли эти дома на этом участке. Дома можно поворачивать на 90 градусов

package helloapp;
import java.util.Scanner;
import static java.lang.Math.max;

public class houses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину участка: ");
        int a = scanner.nextInt();
        System.out.print("Введите ширину участка: ");
        int b = scanner.nextInt();
        System.out.print("Введите длину первого дома: ");
        int c = scanner.nextInt();
        System.out.print("Введите ширину первого дома: ");
        int d = scanner.nextInt();
        System.out.print("Введите длину второго дома: ");
        int e = scanner.nextInt();
        System.out.print("Введите ширину второго дома: ");
        int f = scanner.nextInt();
        
        boolean canFitFirstHouse = (a >= c && b >= d) || (a >= d && b >= c);
        boolean canFitSecondHouse = (a >= e && b >= f) || (a >= f && b >= e);
        
        if (canFitFirstHouse && canFitSecondHouse) {
            System.out.println("Оба дома поместятся на участке");
        } else if (canFitFirstHouse) {
            System.out.println("Поместится только первый дом");
        } else if (canFitSecondHouse) {
            System.out.println("Поместится только второй дом");
        } else {
            System.out.println("Ни один из домов не поместится на участке");
        }
    }
}
