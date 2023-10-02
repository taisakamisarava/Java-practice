package lr2;

/*
1. Вычислить и распечатать факториал числа: произведение всех чисел от 1 и до него.
*/

public class factorial {
	public static void main(String[] args) {
	    int n=3;
	    int result=1;
	    for(byte i=1;i<=n;i++){
	        result*=i;
	    } 
	    
	    System.out.println(result);
	}
}
