package lr2;
/*
2. Ввести число, посчитать сумму цифр в нем
 */


import java.util.Scanner;

public class sum_digits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");		
		int n = scanner.nextInt();
	    int s = 0;
	    while(n != 0){
	        //Суммирование цифр числа
	         s += (n % 10);
	         n /= 10;
	 }
	 System.out.println(s + " ");

	}
}
	    