package odev1;

public class CoursesManager {
	
	public void addCourse(Courses course) {
		System.out.println(course.courseName + " kurs eklendi.");
	}
	public void deleteCourse(Courses course) {
		System.out.println(course.courseName + " kurs silindi");
	}
	public void printCourse(Courses course) {
		System.out.println(course.courseName);
		System.out.println(course.instructorName);
		System.out.println("yüzde "+ course.rateOfView + " izlendi.");
		System.out.println("Ucretsiz");
	}
}
