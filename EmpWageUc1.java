public class EmpWageUc1 {
    public static void main(String[] args) {

			final int is_part_time=1;
			final int is_full_time=2;	
         int emp_rate_per_hours=20;
			int max_hours_per_month=100;
			int no_of_working_days=20;
			int total_Emp_hours=0;
 			int total_working_days=0;
         int empHrs=0;
         int empWage=0;
			while(total_Emp_hours < max_hours_per_month && total_working_days < no_of_working_days) {

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
			
				total_working_days ++;
         	total_Emp_hours += empHrs;
				empWage += emp_rate_per_hours * empHrs;
			}
			System.out.println("total Emp Wages is:- " + empWage );
    }
}
