import java.util.Scanner;
class Students
{
	int id_no;
	int no_of_subjects_registed;
	String[] subject_code;
	int[] subject_credit;
	String[] grade_obtained;
	double spi;

	public Students()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID no:");
		id_no = sc.nextInt();
		System.out.println("Enter no_of_subjects_registed:");
		no_of_subjects_registed = sc.nextInt();
		subject_code  = new String[no_of_subjects_registed];
		subject_credit = new int[no_of_subjects_registed];
		grade_obtained= new String[no_of_subjects_registed];

	   for(int i=0;i<no_of_subjects_registed;i++)
	   	{ System.out.println("enter subject code for subject no"+(i+1));
	   		subject_code[i] = sc.nextLine();
	   		System.out.println("enter subject credit for subject no"+(i+1));
	   		subject_credit[i] = sc.nextInt();
	   		System.out.println("enter subject grade obtained for subject no"+(i+1));
	   }
	}
	public void calculate_spi()
	{
		double totalCredit = 0;
		int temp=0;
		for(int i=0;i<grade_obtained.length;i++)
        {
			totalCredit += subject_credit[i];
			int gradeW = 0;
			if(grade_obtained[i].equals("A"))
            {
				gradeW = 10;
			}
            else if(grade_obtained[i].equals("B"))
            {
				gradeW = 9;
			}
			temp = temp + (subject_credit[i]*gradeW);
		}
		spi = temp/totalCredit;
	}
}
public class Student
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();

		Students[] s = new Student[n];

		for(int i=0;i<n;i++)
        {
			Student[i] = new Student();
		}

		for(int i=0;i<n;i++)
        {
			students[i].calculate_spi();
		}

		for(int i=0;i<n;i++)
        {
			System.out.println("SPI of student with ID "+students[i].id_no +" = "+students[i].spi);
		}
	}
}
	
