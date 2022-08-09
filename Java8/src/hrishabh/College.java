package hrishabh;

/**
 * group name:- college name:- college code:- total branchs :- numbers of total
 * students in college:- no. of total labs:- properties:-
 * study,practicals,learnings
 * 
 * behaviors of college- study,pracicals,learning
 * 
 * @author HRISHAV KUMAR BAGARI
 *
 */

public class College {
	String GroupName = "Tit";
	int collegeCode = 4321;
	String branches = "computer sience, mechenical";
	int numberOfTotalStudentInCollege = 4;
	int numberOfTotalLabs = 30;

	void study() {
		System.out.println("college provids study material");
	}

	void practicals() {
		System.out.println("also practicals");
	}

	void learnings() {
		System.out.println("college provide best learning way");
	}

	public static void main(String[] args) {
		College co = new College();
		System.out.println(co.GroupName);
		System.out.println(co.collegeCode);
		System.out.println(co.branches);
		System.out.println(co.numberOfTotalStudentInCollege);
		System.out.println(co.numberOfTotalLabs);

		co.study();
		co.practicals();
		co.learnings();
	}

}