package codsoft_intern;

import java.util.Scanner;

public class calculator {
	static Scanner scan=new Scanner(System.in);
	static void Line() {
		for(int i=1;i<=35;i++) {
			System.out.print("\u001B[33m~");
		}System.out.println();
	}
	int n;
	int sub,sum=0,avg;
	void total() {
		System.out.print("\n\u001b[32m enter number of subjects : \u001b[39m");
		n=scan.nextInt();
		System.out.println();
		if(n==0) {
			Line();
			System.out.println("\u001B[33mGRADE : \u001B[39mAB");
			System.out.println("\u001B[33mSTATUS : \u001B[31mABSENT\u001B[39m");
			Line();
		}
		if(n!=0) {
		Line();
		for(int i=1;i<=n;i++) {
			
			System.out.print("\u001b[32m Enter subject "+i+" : \u001b[39m");
			sub=scan.nextInt();
			sum+=sub;
		}
		
		Line();
		System.out.println("\n>>\u001b[33m Total of "+n+" subject is : \u001b[39m"+sum);
	}
}
	
	void average() {
		total();
		avg=sum/n;
		System.out.println("\u001B[33m>> AVERAGE of "+n+" subject is : \u001b[39m"+avg+"%");
		System.out.println();
	}
	
	void grade() {
		average();
		if(avg>90 && avg<=100) {
			System.out.println("\u001B[33mGRADE : O");
			System.out.println("STATUS : OUTSTANDING");
			}
		
		else if(avg>80 && avg <=90) {
			System.out.println("\u001B[33mGRADE : A+");
			System.out.println("STATUS : EXCELLENT");
			}
		else if(avg >70 && avg<=80) {
			System.out.println("\u001B[33mGRADE : A");
			System.out.println("STATUS : VERY GOOD");
		}
		else if(avg >60 && avg <=70) {
			System.out.println("\u001B[33mGRADE : B+");
			System.out.println("STATUS : GOOD");
		}
		else if(avg >50 && avg <=60) {
			System.out.println("\u001B[33mGARDE : B");
			System.out.println("STATUS : ABOVE AVERAGE");
		}
		else if(avg	>40 && avg <=50) {
			System.out.println("\u001B[33mGRADE : C");
			System.out.println("STATUS : AVERAGE");
		}
		else {
			System.out.println("\u001B[33mGRADE : F");
			System.out.println("STATUS : FAIL");
		}
		
	}
}