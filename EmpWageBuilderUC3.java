public class EmpWageBuilderUC3
{
	
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME =2;
	public static final int EMP_RATE_PER_HOUR =20;

	public static void main(String[] args)
	{
	//variable
	int empHrs =0 ;
	int wage = 0;

	int empcheck= (int) Math.floor(Math.random()*10) % 3;
	switch(empcheck)
	{
 		case IS_FULL_TIME :
		 empHrs =8;
		break;
		case IS_PART_TIME :
		 empHrs =4;
		break ;
		default:
		empHrs = 0;
	}
	wage = empHrs * EMP_RATE_PER_HOUR ;
	System.out.println("Emp Wage :" +wage);

	}
}
