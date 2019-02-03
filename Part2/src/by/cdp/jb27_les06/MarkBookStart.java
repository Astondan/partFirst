package by.cdp.jb27_les06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarkBookStart {
	public static void main(String[] args) {
		Group group1 = new Group();

		Arrays.asList();
		group1.add(new Student("qqq", Arrays.asList(new Mark(10), new Mark(10))));
		group1.add(new Student("qqwwwq", Arrays.asList(new Mark(2), new Mark(10))));
		//print(group1);
		printAvgs(group1);
		printTops(group1);
		printLoosers(group1);
	}

	
	public static void printTops(Group group) {
		List<Student> toppers = group.getTops(group);
		System.out.println("Число отличников: "+ toppers.size());
	}
	
	public static void printLoosers(Group group) {
		List<Student> loosers = group.getLoosers(group);
		System.out.println("Число получивших 2: "+ loosers.size());
	}


	public static void printAvgs (Group group) {
		System.out.println("Group AVG: "+ group.getAvgGroup(group));
		List<Student> students = group.getGroup();
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			System.out.println("Name: "+student.getName() +" AVG Mark: "+ student.getavgMark());
			}
		}
	}


/*	public static void print(Group group) {
		List<Student> students = group.getGroup();
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			System.out.println("Student: ");
			System.out.println(student.getName());

			printMarks(student);
		}
	}

	public static void printMarks(Student student) {

		List<Mark> marks = student.getMarks();
		System.out.println("Marks: ");
		for (int e = 0; e < marks.size(); e++) {
			Mark mark = marks.get(e);
			System.out.println(mark.getMark());
		}
	}
*/

