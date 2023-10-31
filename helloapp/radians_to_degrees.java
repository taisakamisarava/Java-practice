/*
Перевести угол из радиан в градусы
*/

package helloapp;
import java.util.Scanner;
public class radians_to_degrees {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Введите угол в радианах: ");
	        double radians = input.nextDouble();

	        double degrees = Math.toDegrees(radians);
	        int degreesWhole = (int) degrees;
	        double minutes = (degrees - degreesWhole) * 60;
	        int minutesWhole = (int) minutes;
	        double seconds = (minutes - minutesWhole) * 60;
	        int secondsWhole = (int) seconds;

	        System.out.println("Градусы: " + degreesWhole);
	        System.out.println("Минуты: " + minutesWhole);
	        System.out.println("Секунды: " + secondsWhole);

	        input.close();
	    
	}

}
