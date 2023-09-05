package com.nissan.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	Pattern pattern = Pattern.compile("^[0-9]");
	Scanner sc=new Scanner(System.in);
	String accountNo;
	String customerName;
	String accountType ;
	double balance;
	double minimumBalance;
	String mobileNumber;
	String emailId;
	int ATMPin ;
	static public ArrayList<Customer>al=null;
	public void depositMoney(ArrayList<Customer> al){
		System.out.println("Enter account number");
		String accountNumber=sc.next();
		Pattern pattern = Pattern.compile("^[0-9]");
		
		 Matcher matcher = pattern.matcher(accountNumber);
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		    	
		    	accountNumber=accountNumber;
		      
		    	
		    }
		    else {
		    	
		        System.out.println("Account number not valid");
		      }
		    
		System.out.println("Enter amount to deposit");
		double amount=sc.nextDouble();
		for(int i=0;i<al.size();i++){
			Customer c=al.get(i);
			
			if(c.accountNo.equals(accountNumber)){	
				if(amount>50000){
					String panNumber;
					System.out.println("Enter Pan number");
					panNumber=sc.next();
					c.balance=c.balance+amount;
				}
				else {
					c.balance=c.balance+amount;
				}
			}
			else{
				System.out.println("Account number not found");
			}
		}
	}
	public void withdrawMoney(ArrayList<Customer> al){
		System.out.println("Enter account number");
		long accountNumber=sc.nextLong();
		String accountNumber1=String.valueOf(accountNumber);
		System.out.println("Enter amount to withdraw");
		double amount=sc.nextDouble();
		for(int i=0;i<al.size();i++){
			Customer c=al.get(i);
			
			if(c.accountNo.equals(accountNumber1)){	
				double availableBalance=c.balance-c.minimumBalance;
				if(amount>availableBalance){
					System.out.println("Insufficient balance");
				}
				else{
					if(amount>50000){
		
						String panNumber;
						System.out.println("Enter Pan number");
						panNumber=sc.next();
						c.balance=c.balance-amount;
					}
					else {
						c.balance=c.balance-amount;
					}
				}
			}
			else{
				System.out.println("Account number not found");
			}
		}
	}
	public void showBalance(ArrayList<Customer> al){
		
		System.out.println("Enter account number");
		Long accountNumber;
		accountNumber=sc.nextLong();
		String accountNumber1=String.valueOf(accountNumber);
		for(int i=0;i<al.size();i++){
			Customer c=al.get(i);
			
			if(c.accountNo.equals(accountNumber1)){	
				System.out.println("Balance="+c.balance);
			}
			}
	}
	public void transferMoney(ArrayList<Customer> al){
		System.out.println("Enter sender's account number");
		Long senderAccountNumber;
		senderAccountNumber=sc.nextLong();
		String accountNumber1=String.valueOf(senderAccountNumber);
		System.out.println("Enter receiver's account number");
		Long receiverAccountNumber;
		receiverAccountNumber=sc.nextLong();
		String accountNumber2=String.valueOf(receiverAccountNumber);
		System.out.println("Enter amount to be transfered");
		double transferAmount=sc.nextDouble();
		for(int i=0;i<al.size();i++){
			Customer c=al.get(i);
			
			if(c.accountNo.equals(accountNumber1)){	
				c.balance=c.balance-transferAmount;
			}
			if(c.accountNo.equals(accountNumber2)){	
				c.balance=c.balance+transferAmount;
			}
	}
	}
	

}
