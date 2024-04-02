
public class RepeatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = {1,2,3,4,6,4,7,2,3};
		int n1[]={};
		int a=0;
		int flag=0;
		int k=1;
		for(int i=0;i<n.length;i++)
		{
			a=n[i]; 
			for(int j=k;j<n.length;j++)
			{
				if(a==n[j])
				{
					flag=1;
					System.out.println("bhd");
//					break;
				}
				else
					flag=0;
			}
			k++;
			
			if(flag==0)
			{
				System.out.println(a);
			}
		}
		

	}

}
