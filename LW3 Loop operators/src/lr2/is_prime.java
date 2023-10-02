package lr2;
/*
3. Ввести число, определить является ли оно простым (т.е. делится без остатка только на 1 и себя)
*/


import java.util.Scanner;


public class is_prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");		
		int n = scanner.nextInt();
		String result = " является простым";
				
	    for(int i = 2;i < n; i ++){
		       
	        if(n % i == 0){
	            result = " не является простым";
	        }		
	 }
	 System.out.println("Число "+ n + result);

	}
}
