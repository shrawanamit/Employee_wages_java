public class EmpWageUc1 {
    public static void main(String[] args) {

			final int is_part_time=1;
			final int is_full_time=2;	
         int emp_rate_per_hours=20;
         int empHrs=0;
         int empWage=0;

         int empCheck =(int)Math.floor(Math.random()*10)%3;

		   switch (empCheck) {
                case is_full_time:
                    empHrs = 8;
                    break;
                case is_part_time:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
			empWage = emp_rate_per_hours * empHrs;
			System.out.println("total Emp Wages is:- " + empWage );
    }
}
