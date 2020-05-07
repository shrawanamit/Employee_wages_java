public class EmpWageBuilderArray {

	private static final int is_full_time=2;
    private static final int is_part_time=1;

	private int numOfCompany =0;
	private EmpWageUc1[] companyEmpWageArray;
	
	public EmpWageBuilderArray(){
	 companyEmpWageArray = new EmpWageUc1[5];
	}

	private void addCompanyEmpWage(String company, int emp_rate_per_hours, int no_of_working_days, int max_hours_per_month)
	{
 		companyEmpWageArray[numOfCompany] =new EmpWageUc1(company,emp_rate_per_hours,no_of_working_days,max_hours_per_month);
		numOfCompany++;
	}

	private void computeEmoloyeeWage(){
		for (int i=0; i <numOfCompany ;i++){
			 int totalEmpWage = this.computeEmoloyeeWage(companyEmpWageArray[i]);
		}
	}

	public int computeEmoloyeeWage(EmpWageUc1 companyEmpWage){

		 int empHrs=0,total_Emp_hours=0,total_working_days=0,empWage=0;
	        while(total_Emp_hours < companyEmpWage.max_hours_per_month && total_working_days < companyEmpWage.no_of_working_days) {

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
				System.out.println("Days:- "+ total_working_days + "EmpHours:- "+ total_Emp_hours);
			}
			return  companyEmpWage.emp_rate_per_hours * total_Emp_hours;
	}
	public static void main(String arg[]){

		EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();

		empWageBuilderArray.addCompanyEmpWage("DMart",20,20,100);
		empWageBuilderArray.addCompanyEmpWage("bigBaset",30,30,107);
		empWageBuilderArray.addCompanyEmpWage("vishal",25,26,120);
		empWageBuilderArray.computeEmoloyeeWage();
    }
}
