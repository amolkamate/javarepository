package src.abc;

public class b
{
public static void main(String[] args) {
	String s="abcdachda";
	char[] s1 = s.toCharArray();
	for(int i=0; i<s1.length;i++)
	{
		for( int j=i+1;j<s1.length;j++)
		{
			if(s1[i]==s1[j])
			{
				for(int k=j;s1[k]<s1.length;k++)
				{
					s1[k]=s1[k+1];
//					s1.length
					
				}
			}
		}
//		
	}
	for(int l=0; l<s1.length;l++)
		{
			System.out.println(s1[l]);
		}
//	String s2 = s1.toString();
	
}
}
