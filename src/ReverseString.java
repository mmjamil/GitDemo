
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Mamnun", n="";
		char ch;
		for(int i=0; i<s.length();i++)
		{
			ch=s.charAt(i);
			n=ch+n;
			//System.out.println(n);
		}
		
		System.out.println("Reverse Word" +" "+ n);
		

	}

}