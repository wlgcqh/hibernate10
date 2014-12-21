package com.qiheng.hibernate;

import java.util.Comparator;

public class MyComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		if(o1 == o2){
			return 0;
		}
		int result = Integer.valueOf(o1.getCredit()).compareTo(Integer.valueOf(o2.getCredit()));
		if(result!=0){
			return -result;
		}
		return -o1.getCourse_name().compareTo(o2.getCourse_name());
		
	}

}
