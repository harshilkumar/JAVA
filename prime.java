import java.util.*;
public class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
     System.out.println("Enter Any Number=");
	   int n=sc.nextInt();
	   int flag=0;
	   for(int i=2;i<=(n/2);i++)
	   {
	   	 	if(n%i==0)
	     	{
	   			
	   			flag++;
	   			break;
	   		}

	   }

	   		if(flag==0)
	   		{
	   			System.out.println("Prime");
	   		}
	   		else
	   		{
	   			System.out.println("Not a prime");
	   		}

	   }
}	
