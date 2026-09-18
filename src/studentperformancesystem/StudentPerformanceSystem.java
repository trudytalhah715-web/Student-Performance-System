package studentperformancesystem;
import java.util.Scanner;
public class StudentPerformanceSystem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String again;  
		do {
		
		System.out.println("STUDENT PERFORMANCE SYSTEM");
		System.out.println("--------------------------");
		System.out.println("Enter number of students:");
		int students = input.nextInt();
		input.nextLine();
		String[] names = new String[students];
		double[] averages = new double[students];
		for (int i = 0; i < students; i++) {
			System.out.println("Enter name of student" + (i + 1) + ":");
			names[i] = input.nextLine();
			
			double total = 0;
			for (int j = 1; j <= 3; j++) {
				double mark;
				while (true) {
					System.out.println("Enter mark for subject" + j + ":");
					mark = input.nextDouble();
					
					if (mark >= 0 && mark <= 100) {
						break;
					}
					System.out.println("Please enter a mark between 0 and 100.");
				}
				
				total = total + mark;
			}
			averages[i] = total / 3;
			String result;
			result = averages[i] >= 50 ? "PASS" : "FAIL";
			System.out.println("Result:" + result);
			if (averages[i] >= 80) {
				System.out.println("Grade A");
			}else if (averages[i] >=70) {
				System.out.println("Grade B");
			}else if (averages[i] >= 60) {
				System.out.println("Grade C");
			}else if (averages[i] >= 50) {
				System.out.println("Grade D");
			}else {
				System.out.println("Grade F");
			}
			input.nextLine();
		}
		System.out.println("Number of students:" + students);
		System.out.println("Do you want to use the system again? (yes/no):");
		again = input.nextLine();
		} while (again.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using the system.");
		input.close();

	}

}
