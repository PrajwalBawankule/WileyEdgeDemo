package IOStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

class Student1{
	public String name;
	public String gender;
	public int age;
	public int grade;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public Student1(String name,String gender,int age,int grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}

	public String details() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Name : ").append(this.name).append("\nGender : ").append(this.gender).append("\nAge : ").append(this.age).append("\nGrade : ").append(this.grade).append("\n\n");
		return sb.toString();
	}
}
public class StudentRecords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\studentdata");
		
		BufferedOutputStream bof = new BufferedOutputStream(fout);
		Scanner sc = new Scanner(System.in);
		
		String name, gender;
		int age;
		int grade;
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();sc.nextLine();
		Student1[] stu = new Student1[n];
		for(int i=0;i<n;i++) {
			name = sc.nextLine();
			gender = sc.nextLine();
			age = sc.nextInt();sc.nextLine();
			grade = sc.nextInt();sc.nextLine();
			Student1 st = new Student1(name,gender,age,grade);
			stu[i] = st;
		}
		for(Student1 st : stu) {
			String s = st.details();
			
			byte[] b = s.getBytes();
			
			System.out.println(b);
			
			try {
				bof.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		bof.flush();
		bof.close();
	}

}
