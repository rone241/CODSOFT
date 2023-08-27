package codsoft_intern;
import java.util.*;
public class ATM {
	static Scanner scan=new Scanner(System.in);
	static void Line() {
		for(int i=1;i<=35;i++) {
			System.out.print("\u001B[33m~");
		}System.out.println();
	}
public static void main(String[] args) {
	int op;
	System.out.println("\u001b[32mENTER INITIAL BALANCE :");
	int bal=scan.nextInt();
	bank_account bnk =new bank_account(bal);
	do {
		Line();
	
		System.out.println("\u001b[32m >> AUTOMATIC TELLER MACHINE << ");
		
		Line();
		System.out.println("\u001b[32mchoose what you want to perform :\n");
		System.out.println("	1) WITHDRAW");
		System.out.println("	2) DEPOSIT");
		System.out.println("	3) CHECK BALANCE");
		System.out.println("	4) EXIT");
		Line();
		System.out.print("\u001b[32m option :");
		op=scan.nextInt();
		System.out.println();
		switch(op) {
		case 1 : bnk.withdraw(); break;
		case 2 : bnk.deposit(); break;
		case 3 : bnk.display(); break;
		case 4 :System.out.println(" >> THANK You for Banking with us !!! <<");
			break;
		default :System.out.println("enter valid data");
		}
		Line();
		if(op!=4) {
		System.out.print("\u001b[32m DO you want to Bank again (y/n)? ");
		scan.nextLine();
		String s=scan.nextLine();
		if(s.equalsIgnoreCase("y")) {
			continue;
		}
		else {
			System.out.println(">> THANK You for Banking with us !!! <<");
			Line();
		break;}
		}

	}while(op!=4);
}
}
