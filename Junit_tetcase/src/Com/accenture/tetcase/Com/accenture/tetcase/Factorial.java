package Com.accenture.tetcase;


public class Factorial {
	
	    public int fact(int number) {
	        int i = 1;
	        int result = 1;
	        while (i <= number) {
	            result = result * i;
	            i++;
	        }
	        return result;
	    }
	}