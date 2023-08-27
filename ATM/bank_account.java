package codsoft_intern;

import java.applet.AudioClip;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class bank_account {
	static Scanner scan=new Scanner(System.in);
	int balance;
	int wd;
	int dep;
	
	public bank_account(int s) {
		setBalance(s);
	}
	void setBalance(int s){
		this.balance=s;
	}
void withdraw() {
	System.out.print(" ENTER WITHDRAWAL AMOUNT :");
	wd=scan.nextInt();
	if(wd<=balance) {
		this.balance-=wd;
		if(this.balance==0) {
			System.out.println("\n\u001b[31m MINIMUM BALANCE OF RS.500 SHOULD BE MAINTAINED\u001b[32m");
		}
		System.out.println("\n PLEASE COLLECT YOUR CASH");
		display();
	}
	else {
		System.err.println("\n\u001b[31m insuffiecient balance ");
		System.out.println("\n MINIMUM BALANCE OF RS.500 SHOULD BE MAINTAINED\u001b[32m\n");
		display();
	}
	
}

void deposit() {
	System.out.print(" ENTER DEPOSIT AMOUNT : ");
	dep=scan.nextInt();
	System.out.println();
	this.balance+=dep;
	System.out.println(" YOUR AMOUNT IS SUCCESSFULLY DEPOSITED !!!");
	display();
}
public void exit() {

}
public void display() {
	System.out.println("\n BALANCE : RS."+this.balance+"\n");
	
}
}
