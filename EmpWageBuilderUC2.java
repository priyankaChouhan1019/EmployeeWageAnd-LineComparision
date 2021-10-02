public class EmpWageBuilderUC2
{
	public static void main(String[] args)
	{
		//Constants
	int RATE_PER_HOUR ;
	int IS_FULL_TIME = 1;
	int EMP_RATE_PER_HOUR =20;
	//variable
	int empHrs =0 ;
	int wage = 0;

	double empcheck=Math.floor(Math.random()*10)%2;
	if(empcheck == IS_FULL_TIME)
		empHrs = 8;
	wage = empHrs * EMP_RATE_PER_HOUR ;
	System.out.println("Emp Wage :" +wage);

	}
}
