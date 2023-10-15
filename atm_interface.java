package codsoft;
import java.util.*;

public class atm_interface {
	int balance=50000;//assumed the balance is 50000
	
	public atm_interface() {
		int bal;//to display balanced after operations
		int w_amt;//withdraw amt
		int d_amt;//deposi amnt
		int n;//for choices
		Scanner sc=new Scanner(System.in);
	
		
		while(true) {
			
			System.out.println("Welcome to ATM interface #CODSOFT");
			System.out.println("1.Check balance");
			System.out.println("2.Withdraw");
			System.out.println("3.Deposite");
			System.out.println("4.Exit");
			System.out.println("Enter the operation to be performed ::");
			n=sc.nextInt();
			
			
			
			switch(n) {//swotch case for performing operations mentioned above
				
			case 1:
				bal=check_balance();
				System.out.println("Your current balance is :: "+bal);
				break;
			
			case 2:
				
				System.out.println("Enter amount to be WITHDRAWED :: ");
				w_amt=sc.nextInt();
				bal=withdraw_amt(w_amt);
				System.out.println("You withdrawed"+" Rs."+w_amt );
				System.out.println("Your current balance is :: "+bal);
				break;
			case 3:
				
				System.out.println("Enter amount to be DIPOSITED :: ");
				d_amt=sc.nextInt();
				bal=diposit_amt(d_amt);
				System.out.println("You Diposited"+" Rs."+d_amt );
				System.out.println("Your current balance is :: "+bal);
				break;
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice ...please try again later");
			
			}
		}
		
		
	}//constructor closed
	
	public int withdraw_amt(int w) {
		Scanner sc1=new Scanner(System.in);
		String y_n;
		
		int temp_bal=balance;
		
		int cur_bal=temp_bal-w;
		balance=cur_bal;
		System.out.println(cur_bal);
		if(cur_bal >temp_bal) {
			System.out.println("Sorry insufficient balance ::( ");
		}else if(cur_bal<temp_bal) {
			return cur_bal;
		}else if (cur_bal==temp_bal) {
			System.out.println("Do you want to withdraw all the amount y/n ::");
			y_n=sc1.next();
			
			if(y_n=="y") {
				return cur_bal;
				
			}else if(y_n=="n"){
				return cur_bal=cur_bal+w;
			}
		}
		return balance;
	}//returns balance after withdrawing
	
	public int diposit_amt(int w) {
		int cur_bal=balance+w;
		balance=cur_bal;
		return cur_bal;
	}//deposite operation
	public int check_balance() {
		
		return balance;
		
	}//checkbalance operation
	
	
	public static void main(String[] args) {
		
		atm_interface codsoft=new atm_interface();
		
	}

}
