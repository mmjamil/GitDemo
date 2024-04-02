import java.util.Arrays;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"geeksforgeeks", "geaks", "geek", "geezer"};
		Arrays.sort(input);
		String s = input[0];
		String s1 =input[input.length-1];		
		for(int i=0;i<input.length;i++)
		{
			while(input[i].indexOf(s) !=0)
			{
				s=s.substring(0,s.length()-1);
			}
		}
		System.out.println(s);
		

	}

}
