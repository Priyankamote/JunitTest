package Com.accenture.tetcase;
import java.util.ArrayList;
public class Fibo {
	

	
	public void Fib_No(int position) {
	    position = 10;
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    a.add(0);
	    a.add(1);
	    
	      System.out.println(position); 
	    

	  
	        int sumofBoth = a.get(0) + a.get(1);
	        a.set(0,a.get(1));
	        a.set(1,sumofBoth);
	      }


}
