package comp;

public class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int marks;

	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}



	public int compareTo(String anotherStudent) {
		
	//	return (x < y) ? -1 : ((x == y) ? 0 : 1);
		
	//	return Integer.compare(x, y);
		
		
		return this.name.compareTo(anotherStudent);
		
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
