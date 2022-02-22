package Com.accenture.tetcase;
public class isPalindrome{
public boolean isPalindrome(String input)
{
	int head = 0; int tail = input.length() - 1; while (head < tail) 
	{
		if (input.charAt(head) != input.charAt(tail)) 
		{ 
			return false; 
			}
		head++; tail--;
		}
	return true;
	}
}
	


