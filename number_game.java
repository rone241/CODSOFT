package intern;
import java.util.*;
public class number_game {
	static Scanner scan =new Scanner(System.in);
public static void main(String[] args) {
	Random s=new Random();
	int min=1;
	int max=100;
	
	String str="y";
	//System.out.println(guess);
	System.out.println("Make a guess between "+min+" and "+max+" and you have 10 chances");
	while(str.equalsIgnoreCase(str)) {
		int guess=s.nextInt(max-min)+min;
	for(int i=1;i<=10;i++) {
		
		System.out.println("\u001B[39m enter your guess :");
		int get=scan.nextInt();
		if(guess==get) {
			System.out.println("\u001B[33m your guess is correct");
			System.out.println("your score is :"+(10-i));
			break;
		}
		if(get>guess) {
			System.out.println("\u001B[31m your guess is higher than random");
		}
		else {
			System.out.println("\u001B[31m your guess is lower than random");
		}
		if(i==7) {
			System.out.println("\u001B[33m random guess is :"+guess);
			System.out.println("your score is :"+(10-i));
			break;
		}
	}
	System.out.println("\nDo you wanna play again (y/n):");
	scan.nextLine();
	str=scan.nextLine();
	}
}


}
