package com.wiley.springcore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentDesc {

	private int id;
	String [] skills = new String[5];
	Set<Integer> marks = new HashSet<Integer>();
	
	Map<String,Integer> courseduration = new HashMap<String, Integer>();
	
	private Properties props;
	public StudentDesc(int id, String[] skills, Set<Integer> marks, Map<String, Integer> courseduration,
			Properties props) {
		super();
		this.id = id;
		this.skills = skills;
		this.marks = marks;
		this.courseduration = courseduration;
		this.props = props;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public StudentDesc(int id, String[] skills, Set<Integer> marks, Map<String, Integer> courseduration) {
		super();
		this.id = id;
		this.skills = skills;
		this.marks = marks;
		this.courseduration = courseduration;
	}
	public Map<String, Integer> getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(Map<String, Integer> courseduration) {
		this.courseduration = courseduration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public Set<Integer> getMarks() {
		return marks;
	}
	public void setMarks(Set<Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDesc [id=" + id + ", skills=" + Arrays.toString(skills) + ", marks=" + marks
				+ ", courseduration=" + courseduration + ", props=" + props + "]";
	}
	public StudentDesc(int id, String[] skills, Set<Integer> marks) {
		super();
		this.id = id;
		this.skills = skills;
		this.marks = marks;
	}
	public StudentDesc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
