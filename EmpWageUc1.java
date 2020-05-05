public class EmpWageUc1 {
    public static void main(String[] args) {
        int is_full_time=1;
        int  empCheck =(int) Math.floor(Math.random()*10)%2;
        if (empCheck == is_full_time) {
            System.out.println("Emp is present");
        } else {
            System.out.println("Emp is Absent");
        }

   }
}
