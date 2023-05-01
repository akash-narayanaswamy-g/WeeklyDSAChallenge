package week_5_Math;

//1491. Average Salary Excluding the Minimum and Maximum Salary
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

	public static void main(String[] args) {
		int[] salary = {4000,3000,1000,2000};
		System.out.println(average(salary));
	}
	
	public static double average(int[] salary) {
        double ans=salary[0],min=salary[0],max=salary[0];
        for (int i = 1; i < salary.length; i++) {
			min=Math.min(min, salary[i]);
			max=Math.max(max, salary[i]);
			ans+=salary[i];
		}
        ans-=(min+max);
        return ans*1.0/(salary.length-2);
    }

}
