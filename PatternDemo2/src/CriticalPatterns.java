//D-->diagonal
//D1-->i==j
//D2-->i+j==n-1
//p1-->i+j==(n-1)/2
//p2-->i-j==(n-1)/2
//p3-->j-i==(n-1)/2
//p4-->i+j==(n-1)+(n-1)/2 (or) 3*((n-1)/2)
public class CriticalPatterns {

	public static void main(String[] args)
	{
		int i,j,n=17;
			
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++) 
			{
				if(i==0 || j==0 ||i==n-1 || j==n-1)
				      System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			
			System.out.print("    ");              //print the space after the first pattern
			
			for(j=0;j<n;j++) 
			{
				if(i==0 || j==0 ||i==n-1 || j==n-1 || i==j || i+j==n-1)
				      System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			
			 System.out.print("    ");              //print the space after the pattern
				
				for(j=0;j<n;j++) 
				{
					if(i==0 || j==0 ||i==n-1 || j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==(n-1)+(n-1)/2)
					      System.out.print("*");
					else
						System.out.print(" ");
					
				}
			
			
			System.out.print("    ");               //print the space after the pattern
			
			for(j=0;j<n;j++) 
			{
				if(i==0||i==n-1||j==0||j==n-1||i==j||i+j==n-1||i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==3*(n-1)/2)
				      System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			System.out.print("    ");                    //print the space after the pattern
			
			for(j=0;j<n;j++) 
			{
				if(i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n-1)+(n-1)/2)
				      System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			  System.out.print("    ");                  //print the space after the pattern
				
				for(j=0;j<n;j++) 
				{
					if(i==0&&j<(n-1)/2 || j==0&&i<(n-1)/2 || i+j<=(n-1)/2)
					      System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				 
                          System.out.print("    ");                //print the space after the pattern
				 
				for(j=0;j<n;j++) 
				{
					if(j==0&&i>(n-1)/2 || i==n-1&&j<(n-1)/2 || i-j>=(n-1)/2)
					      System.out.print("*");
					else
						System.out.print(" ");
					
				}
				
				 System.out.print("    ");             //print the space after the pattern 
					
					for(j=0;j<n;j++) 
					{
						if(i==0&&j>(n-1)/2 || j==n-1&&i<(n-1)/2 || j-i>=(n-1)/2)
						      System.out.print("*");
						else
							System.out.print(" ");
						
					}
					
					
					 System.out.print("    ");             //print the space after the pattern
						
						for(j=0;j<n;j++) 
						{
							if(i==n-1&&j>(n-1)/2 || j==n-1&&i>(n-1)/2 || i+j>=(n-1)+(n-1)/2)
							      System.out.print("*");
							else
								System.out.print(" ");
							
						}
						
				
						 System.out.print("    ");            //print the space after the pattern
							
							for(j=0;j<n;j++) 
							{
								if((i==0&&j<(n-1)/2 || j==0&&i<(n-1)/2 || i+j<=(n-1)/2) || (j==0&&i>(n-1)/2 || i==n-1&&j<(n-1)/2 || i-j>=(n-1)/2) || (i==0&&j>(n-1)/2 || j==n-1&&i<(n-1)/2 || j-i>=(n-1)/2) || (i==n-1&&j>(n-1)/2 || j==n-1&&i>(n-1)/2 || i+j>=(n-1)+(n-1)/2))
								      System.out.print("*");
								else
									System.out.print(" ");
								
							}
			
				
							 System.out.print("    ");        //print the space after the pattern
								
								for(j=0;j<n;j++) 
								{
									if(i+j>=(n-1)/2&&i<=(n-1)/2&&j<=(n-1)/2 || i-j<=(n-1)/2&&j<=(n-1)/2&&i>=(n-1)/2 || j-i<=(n-1)/2&&i<=(n-1)/2&&j>=(n-1)/2 || i+j<=(n-1)+(n-1)/2&&i>=(n-1)/2&&j>=(n-1)/2)
									      System.out.print("*");
									else
										System.out.print(" ");
									
								}
								
				
				
			
		    System.out.println();
		}
		

	}

}
