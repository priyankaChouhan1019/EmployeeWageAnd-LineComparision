import java.util.Scanner;
class Day3_UC1_1
{
	public static void main(String arg[])
	
	{
	
             	 int x1,x2,y1,y2;
 
	         double dis;
	
	         Scanner sc=new Scanner(System.in);
 
	         System.out.println("enter x1 and y1point");
	   
                 x1=sc.nextInt();
	   
                 y1=sc.nextInt();
 
	         System.out.println("enter x2 and y2 point");
	   
                 x2=sc.nextInt();

                 y2=sc.nextInt();
 		
 		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") ="+dis);
	}
}