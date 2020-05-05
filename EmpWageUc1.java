public class EmpWageUc1 {
    
	 private static final int is_full_time=2;
    private static final int is_part_time=1;

    private final String company;
    private final int emp_rate_per_hours;
    private final int no_of_working_days;
    private final int max_hours_per_month;

    public EmpWageUc1(String company, int emp_rate_per_hours, int no_of_working_days, int max_hours_per_month) {
        this.company = company;
        this.emp_rate_per_hours = emp_rate_per_hours;
        this.no_of_working_days = no_of_working_days;
        this.max_hours_per_month = max_hours_per_month;
    }

	public int computeEmoloyeeWage(){
		int empHrs=0,total_Emp_hours=0,total_working_days=0,empWage=0;
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
			}
			return  emp_rate_per_hours * total_Emp_hours;
		}
		
		public static void main(String arg[]){
			EmpWageUc1 dMart = new EmpWageUc1("dMart",20,20,100);
			EmpWageUc1 bigBaset = new EmpWageUc1("bigBaset",30,30,107);
			EmpWageUc1 vishal = new EmpWageUc1("vishal",25,26,120);
			System.out.println("total employee wage for company " + dMart.company + " is: "+ dMart.computeEmoloyeeWage());
			System.out.println("total employee wage for company " + bigBaset.company + " is: "+ bigBaset.computeEmoloyeeWage());
			System.out.println("total employee wage for company " + vishal.company + " is: "+ vishal.computeEmoloyeeWage());
    }
}
