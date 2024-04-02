
public class ConsecutiveRepeatLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsecutiveRepeatLetter obj= new ConsecutiveRepeatLetter();
		String st="compuuterr";
		obj.string(st);
	}
	
	public void string(String s)
	{
		char c=' ';
		String s1="";
		for(int i=0;i<s.length();i++)
		{			
			if(c!=s.charAt(i))
			{
				s1=s1+s.charAt(i);
			}
			c=s.charAt(i);
		}
		System.out.println(s1);
	}

}
