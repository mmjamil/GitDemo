
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="SAS";
		String sNew="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			sNew=c+sNew;
		}
		if(sNew.equalsIgnoreCase(s))
		{
			System.out.println("It is palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
