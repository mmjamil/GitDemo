
public class SplitWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Selenium Automation";
		String s1[]=s.split(" ");
		String s2="";
		String s3=" ";
		for(int i=0;i<s1.length;i++)
		{
			 s2=s1[i];
			 System.out.println(s2);
//			 if(s2.equalsIgnoreCase("Automation"))
//			 {
//				 for(int i1=0;i1<s2.length();i1++)
//				 {
//					 char c=s2.charAt(i1);
//					 s3=c+s3;
//				 }
//				 System.out.println(s3);
//			 }
		}
		
	}	
}
