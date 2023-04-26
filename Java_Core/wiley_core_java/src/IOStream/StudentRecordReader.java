package IOStream;
import java.util.*;
import java.io.*;

public class StudentRecordReader {

	DataInputStream dataInput;
	
	public StudentRecordReader(String inputFile) throws FileNotFoundException {
		dataInput = new DataInputStream(new FileInputStream(inputFile));
	}
	public List<Student> readAll() throws IOException{
		List<Student> listStudent = new ArrayList<>();
		try {
			while(true) {
				String name = dataInput.readUTF();
				boolean gender = dataInput.readBoolean();
				int age = dataInput.readInt();
				float grade = dataInput.readFloat();
				
				System.out.println("Name : "+name);;
				Student student = new Student(name,gender,age,grade);
				listStudent.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		dataInput.close();
		return listStudent;
	}
	public static void main(String[] args) {
		String inputFile = "C:\\Users\\Acer\\Documents\\Wiley Edge\\wiley_git_project\\Java_Core\\wiley_core_java\\data\\studentdata";
		try {
			StudentRecordReader reader = new StudentRecordReader(inputFile);
			List<Student> listStudents = reader.readAll();
			for(Student st : listStudents) {
				System.out.print(st.getName()+"\t");
				System.out.print(st.getGender()+"\t");
				System.out.print(st.getAge()+"/t");
				System.out.print(st.getGrade());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
