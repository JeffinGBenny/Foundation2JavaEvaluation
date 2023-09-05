package com.nissan.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.nissan.model.Administrator;
import com.nissan.model.Customer;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char isAdminChoice='n';
		ArrayList<Customer> al=new ArrayList<Customer>();
		int option;
		do{
		System.out.println("Are you 1.administrator or 2.customer");
		option=sc.nextInt();
		if(option==1){
		int ch;
		char choice='n';
		
		do{
		System.out.println("Banking App");
		System.out.println("Enter your choice");
		System.out.println("1. Add customer");
		System.out.println("2. Update customer");
		System.out.println("3. Delete customer");
		System.out.println("4. Display all customers");
		System.out.println("5. Display customers");
		Administrator admin=new Administrator();
		ch=sc.nextInt();
		switch(ch){
		case 1:admin.addCustomer(al);
			break;
		case 2:admin.updateCustomerDetails(al);
		break;
		case 3:admin.deleteCustomer(al);
		break;
		case 4:admin.displayAll(al);
		break;
		case 5:admin.displayCustomer(al);
		break;
		default:System.out.println("Wrong option");
		}
		System.out.println("Do you want to continue as admin");
		choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');
		}
		else{
			int ch;
			char choice='n';
			
			do{
			System.out.println("Banking App");
			System.out.println("Enter your choice");
			System.out.println("1. Deposit money");
			System.out.println("2. withdraw money");
			System.out.println("3. Show Balance");
			System.out.println("4. Transfer Money");
			
			Customer c=new Customer();
			ch=sc.nextInt();
			switch(ch){
			case 1:c.depositMoney(al);
				break;
			case 2:c.withdrawMoney(al);
			break;
			case 3:c.showBalance(al);
			break;
			case 4:c.transferMoney(al);
			break;
			
			default:System.out.println("Wrong option");
			}
			System.out.println("Do you want to continue as customer");
			choice=sc.next().charAt(0);
			}while(choice=='y'||choice=='Y');
		}
		System.out.println("Do you want to continue in the banking app");
		isAdminChoice=sc.next().charAt(0);
		}while(isAdminChoice=='y'||isAdminChoice=='Y');
	}

}
