package by.cdp.jb27_les06;

import java.util.List;
import java.util.ArrayList;

public class Student {
	private String name;
	private List <Mark> marks = new ArrayList<Mark>();
// private List<Mark> marks;
	
	public Student(String name, List <Mark> marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mark> getMarks() {
		return marks;
	}
		
		

	
	public int getavgMark() {
		int avgMark = 0;
		
		for (int q = 0; q < marks.size(); q++) {
			Mark mark = marks.get(q);
			avgMark = avgMark + mark.getMark();
		} 
		avgMark = avgMark/marks.size();
		return avgMark;
	}
	

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return " Mark = " + marks;
	}

}