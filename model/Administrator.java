package com.nissan.model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Administrator {
	ArrayList<Customer> al=new ArrayList<Customer>();
	Random random = new Random();
	Scanner sc=new Scanner(System.in);
	public void addCustomer(ArrayList<Customer> al){
		Customer c=new Customer();
		long min = 100000000L; // Smallest 9-digit number
        long max = 999999999L; // Largest 9-digit number
        long accountNo = min + (long) (random.nextDouble() * (max - min + 1));
		c.accountNo=String.valueOf(accountNo);
		System.out.println("Enter Customer Name");
		c.customerName=sc.next();
		System.out.println("Enter account type");
		c.accountType=sc.next();
		c.balance=0;
		c.minimumBalance=2500;
		System.out.println("Enter mobile number");
		String mobileNumber=sc.next();
		Pattern pattern = Pattern.compile("^[0-9]");
	    Matcher matcher = pattern.matcher(mobileNumber);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	    	if(mobileNumber.length()==10){
	        c.mobileNumber=mobileNumber;
	      } 
	    	else{
	    		System.out.println("Mobile number does not have 10 digits");
	    		
	    	}
	    }
	    else {
	    	
	        System.out.println("Mobile number not valid");
	      }
		System.out.println("Enter email id");
		c.emailId=sc.next();
		c.ATMPin= random.nextInt(1000);
		al.add(c);
		System.out.println("Customer added successfully");
	}

	public void updateCustomerDetails(ArrayList<Customer> al){
		System.out.println("Enter account number");
		long accountNumber=sc.nextLong();
		String accountNumber1=String.valueOf(accountNumber);
		for(int i=0;i<al.size();i++){
			Customer c=al.get(i);
			if(c.accountNo.equals(accountNumber1)){
				System.out.println("Enter new mobile number");
				c.mobileNumber=sc.next();
				System.out.println("Enter new email id");
				c.emailId=sc.next();
			}
			}
	}
	
	public void deleteCustomer(ArrayList<Customer> al){
		System.out.println("Enter account number");
		long accountNumber=sc.nextLong();
		String accountNumber1=String.valueOf(accountNumber);
		for(int i=0;i<al.size();i++){
			Customer c=al.get(i);
			if(c.accountNo.equals(accountNumber1)){
				al.remove(c);
				System.out.println("Customer deleted successfully");
			}
			}
	}
	public void displayAll(ArrayList<Customer> al){
		for(int i=0;i<al.size();i++){
				Customer c=al.get(i);
			
				System.out.println("Account no: "+c.accountNo);
				System.out.println("Customer name: "+c.customerName);
				System.out.println("Account type: "+c.accountType);
				System.out.println("Balance: "+c.balance);
				System.out.println("email id: "+c.emailId);
				System.out.println("Mobile no: "+c.mobileNumber);
				
				
			}
			} 
		  
		  
	public void displayCustomer(ArrayList<Customer> al){
		System.out.println("Enter account number");
		long accountNumber=sc.nextLong();
		String accountNumber1=String.valueOf(accountNumber);
		for(int i=0;i<al.size();i++){
		Customer c=al.get(i);
		
		if(c.accountNo.equals(accountNumber1)){
			System.out.println("Account no: "+c.accountNo);
			System.out.println("Customer name: "+c.customerName);
			System.out.println("Account type: "+c.accountType);
			System.out.println("Balance: "+c.balance);
			System.out.println("email id: "+c.emailId);
			System.out.println("Mobile no: "+c.mobileNumber);
			
		}
		}
	}
}
	

