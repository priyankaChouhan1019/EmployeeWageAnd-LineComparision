public class EmpWageBuilderUC1
{
    public static void main(String[] args)
    {
        //constants
        int IS_FULL_TIME =1;
        //computation
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if(empcheck == IS_FULL_TIME)
         System.out.println("emp is present");
         else
         System.out.println("emp is absent");
    }
}