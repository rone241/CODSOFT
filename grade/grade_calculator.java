package codsoft_intern;
import java.util.*;
public class grade_calculator {
	static Scanner scan=new Scanner(System.in);
	static void Line() {
		System.out.println();
		for(int i=1;i<=35;i++) {
			System.out.print("\u001B[33m~");
		}System.out.println();
	}
public static void main(String[] args) {
	calculator cal=new calculator();
	System.out.println("\n\u001B[33m >> STUDENT GRADE CALCULATOR <<");
	Line();
	
	System.out.println("\u001B[32mchoose what you want to calculate \n");
	System.out.println("	1) TOTAL");
	System.out.println("	2) AVERAGE");
	System.out.println("	3) GRADE");
	
	System.out.print("\n\u001B[32m enter your choice :\u001B[39m");
	int n=scan.nextInt();
	Line();
	
	switch(n) {
	case 1 ->cal.total();
	case 2-> cal.average();
	case 3-> cal.grade();
	}
}
}
