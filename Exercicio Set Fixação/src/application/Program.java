package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int numberStudents = sc.nextInt();
		for(int i = 1; i <= numberStudents; i++) {
			int codeStudent = sc.nextInt();
			set.add(new Student(codeStudent));
		}
		System.out.print("How many students for course B? ");
		numberStudents = sc.nextInt();
		for(int i = 1; i <= numberStudents; i++) {
			int codeStudent = sc.nextInt();
			set.add(new Student(codeStudent));
		}
		System.out.print("How many students for course C? ");
		numberStudents = sc.nextInt();
		for(int i = 1; i <= numberStudents; i++) {
			int codeStudent = sc.nextInt();
			set.add(new Student(codeStudent));
		}
		
		System.out.print("Total students: " + set.size());
		
		
		sc.close();
	}

}
