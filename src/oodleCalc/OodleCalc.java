package oodleCalc;

import java.util.Arrays;
import java.util.Scanner;

public class OodleCalc {

	private static final Scanner keyboard = new Scanner(System.in);
	public static int oodle;
	public static int B = 4;
	public static int Cy = 5;
	public static int E = 8;
	public static int Tr = 8;

	public static void main(String[] args) {
		System.out.print("How many things in an oodle?: ");
		oodle = keyboard.nextInt();
		int max_cars = (int) Math.floor((Cy*oodle)/3);
		double max_oodle_cars = (Math.floor((Cy*oodle)/3))/oodle;
		System.out.println("There are " + oodle + " of things in an oodle.");
		System.out.println(max_oodle_cars + " oodles of cars were made.");
		System.out.println(max_cars + " cars were made.");
		System.out.println("Bodies left:\t" + (B*oodle - (max_cars)*1));
		System.out.println("Cylinders left:\t" + (Cy*oodle - (max_cars)*3));
		System.out.println("Engines left:\t" + (E*oodle - (max_cars)*1));
		System.out.println("Tires left:\t" + (Tr*oodle - (max_cars)*4));
		
		
		
		while (oodle != (double) 1) {
			System.out.print("How many things in an oodle?: ");
			oodle = keyboard.nextInt();
			max_cars = (int) Math.floor((Cy*oodle)/3);
			max_oodle_cars = (Math.floor((Cy*oodle)/3))/oodle;
			System.out.println("There are " + oodle + " of things in an oodle.");
			System.out.println(max_oodle_cars + " oodles of cars were made.");
			System.out.println(max_cars + " cars were made.");
			System.out.println("Bodies left:\t" + (B*oodle - (max_cars)*1));
			System.out.println("Cylinders left:\t" + (Cy*oodle - (max_cars)*3));
			System.out.println("Engines left:\t" + (E*oodle - (max_cars)*1));
			System.out.println("Tires left:\t" + (Tr*oodle - (max_cars)*4));
		}
	}
}