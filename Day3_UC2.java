class Day3_UC2
{
	public static void main (String[] args)
	{
		int x1,x2,y1,y2;
		int p1,q1,p2,q2;
		double len1,len2;
		x1=1; y1=1; x2=4;y2=4;
q1=1; q1=1; q2=4;q2=4;
		len1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length of line one is = "+len1);
		
		len2=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
		System.out.println("length of line one is = "+len2);

		if(len1.equals(len2))
		{
			System.out.println("length is equal");
                }
	}
}