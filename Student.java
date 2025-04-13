import java .util.Scanner;
public class Student {
	String name;
	int age;
	double marks;

    //constructor
	Student(String name, int age, double marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	void display() {
		System.out.println("\n--- Student Details ---");
		System.out.println("Name  : " + name);
		System.out.println("Age   : " + age);
		System.out.println("Marks : " + marks);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student's name: ");
		String name = scanner.nextLine();

		System.out.print("Enter student's age: ");
		int age = scanner.nextInt();

		System.out.print("Enter student's marks: ");
		double marks = scanner.nextDouble();

		Student student = new Student(name, age, marks);
		student.display();
	}
}