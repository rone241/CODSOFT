package intern;
import java.util.*;
public class number_game {
	static Scanner scan =new Scanner(System.in);
public static void main(String[] args) {
	Random s=new Random();
	int min=1;
	int max=100;
	
	String str="y";
	System.out.println("\n>> Make a guess between "+min+" and "+max+" and you have 10 chances <<");
	while(str.equalsIgnoreCase(str)) {
		int guess=s.nextInt(max-min)+min;
	for(int i=1;i<=10;i++) {
		
		System.out.print("\n\u001B[36m enter your guess :");
		int get=scan.nextInt();
		if(guess==get) {
			System.out.println("\n\t\u001B[33m your guess is correct");
			System.out.println("your score is :"+(10-i));
			break;
		}
		if(get>guess) {
			System.out.println("\u001B[31m your guess is too high... ");
		}
		else {
			System.out.println("\u001B[31m your guess is too low... ");
		}
		if(i==10) {
			System.out.println("\u001B[33m random guess is :"+guess);
			System.out.println(" your score is :"+(10-i));
			break;
		}
	}
	System.out.println("\n\u001B[32mDo you wanna play again (y/n):");
	scan.nextLine();
	str=scan.nextLine();
	}
}


}
