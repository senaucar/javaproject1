package odev1;

public class Main {

	public static void main(String[] args) {
		
		Instructors instructor1 = new Instructors("Engin Demirog", 1);
		Instructors instructor2 = new Instructors("Sena Ucar", 2);
		InstructorsManager instructorManager = new InstructorsManager();
		
		instructorManager.addInstructor(instructor1);
		instructorManager.deleteInstructor(instructor2);
		
		Courses course1 = new Courses("Yazılım geliştirici yetiştirme kursu C# + Angular", instructor1.name, 10,0);
		Courses course2 = new Courses("Yazılım geliştirici yetiştirme kursu Java + React", instructor1.name, 20,0);
		
		Courses[] courses = new Courses[] {course1 , course2};
		CoursesManager courseManager = new CoursesManager(); 
		for (Courses course : courses) {
			courseManager.printCourse(course);
			System.out.println("---------------------");
			System.out.println();
		}
		
		Courses course3 = new Courses("Programlamaya giriş için temel kurs", instructor1.name, 50,0 );
		courseManager.addCourse(course3);
		courseManager.deleteCourse(course2);
	}

}
