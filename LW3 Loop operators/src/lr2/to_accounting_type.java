package lr2;

public class to_accounting_type {

		public static void main(String[] args) {
			long number = 1000000015;
			long reverse = 0;
			for(;number > 0; number /= 10){
			    reverse = (reverse * 10) + (number % 10);
	            }	
	        int pos=0;
			for(;reverse > 0; reverse /= 10){
			   long result = 0;
			   result = reverse % 10;
			   
			   	System.out.print(result);
			   	if(pos % 3 == 0){
			   	    	System.out.print(" ");
			   	}
			   	pos++;
			}
			
		}
	}
