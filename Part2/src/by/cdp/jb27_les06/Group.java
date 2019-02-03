package by.cdp.jb27_les06;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private List<Student> group = new ArrayList<Student>();

	public Group() {
	}

	public List<Student> getGroup() {
		return group;
	}

	public List<Student> getLoosers(Group group) {
		List<Student> loosers = new ArrayList<Student>();
		List<Student> students = group.getGroup();
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			List<Mark> badmarks = student.getMarks();
			for (int b = 0; b < badmarks.size(); b++) {
				Mark badmark = badmarks.get(b);
				if (badmark.getMark()==2) {
				loosers.add(student);
				}
			}
		}
		return loosers;
	}

	public List<Student> getTops(Group group) {
		List<Student> tops = new ArrayList<Student>();
		List<Student> students = group.getGroup();
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getavgMark() == 10) {
				tops.add(student);
			}
		}
		return tops;
	}

	public static int getAvgGroup(Group group) {
		int avgMarkGroup = 0;
		List<Student> students = group.getGroup();
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			avgMarkGroup = avgMarkGroup + student.getavgMark();
		}
		avgMarkGroup = avgMarkGroup / students.size();
		return avgMarkGroup;
	}

	public void add(Student student) {
		group.add(student);
	}
}
