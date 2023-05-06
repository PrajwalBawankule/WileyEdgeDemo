package Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private int ID;
    private String name;
    private int problemsSolved;
    private int grade;

    public Student(int ID,String name, int problemsSolved, int grade) {
    	this.ID = ID;
    	this.name = name;
        this.problemsSolved = problemsSolved;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getProblemsSolved() {
        return problemsSolved;
    }

    public int getID() {
        return ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

public class StudentsFilteringStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Student> students = new ArrayList<>();
	        students.add(new Student(1, "Prajwal", 10, 90));
	        students.add(new Student(2, "Parth", 9, 70));
	        students.add(new Student(3, "Rahul", 11, 90));
	        students.add(new Student(4,"Ram", 5, 60));
	        students.add(new Student(5, "Shyam", 3, 35));
	        students.add(new Student(6, "Tom", 7, 75));
	        students.add(new Student(7, "Soham", 9, 95));
	        students.add(new Student(8, "Peter", 8, 80));

	        System.out.println("Students list :");
	        for(Student s : students) {
	        	System.out.println("ID: "+s.getID()+"\tName: "+s.getName()+"\tProblems solved: "+s.getProblemsSolved()+"\tGrade: "+s.getGrade());
	        }
	        // Filter students based on no of problems solved
	        List<Student> filteredStudents = students.stream()
	        		.sorted(Comparator.comparingInt(Student::getProblemsSolved).reversed())
	                .collect(Collectors.toList());

	        // Update grade
	        filteredStudents.forEach(student -> {
	            int grade = student.getGrade();
	            if (grade >= 80) {
	                student.setGrade(grade + 5);
	            } else if (grade >= 70) {
	                student.setGrade(grade + 3);
	            } else {
	                student.setGrade(grade + 1);
	            }
	        });

	        // Sort by grade and no of problems solved
	        List<Student> sortedStudents = filteredStudents.stream()
	                .sorted(Comparator.comparing(Student::getGrade)
	                        .thenComparing(Student::getProblemsSolved).reversed())
	                .collect(Collectors.toList());

	        // Get top 5 students
	        int topN = 5;
	        List<Student> topStudents = sortedStudents.stream()
	                .limit(topN)
	                .collect(Collectors.toList());

	        // Print results
	        System.out.println("\nFiltered students based problems solved:");
	        filteredStudents.forEach(student -> System.out.println("Name: "+student.getName() + "\tGrade: " +
	                student.getGrade() + "\tProblems Solved: " + student.getProblemsSolved()));
	        System.out.println("\nTop " + topN + " students filtered on grades and no. of problems solved:");
	        topStudents.forEach(student -> System.out.println("Name: "+student.getName() + "\tGrade: " +
	                student.getGrade() + "\tProblems Solved: " + student.getProblemsSolved()));

	}

}
