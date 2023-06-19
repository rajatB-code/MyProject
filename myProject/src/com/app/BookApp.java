package com.app;
import java.util.*;

import com.DAO.BookImplementation;

public class BookApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		BookImplementation b=new BookImplementation();
		char ch;
		do
		{
			System.out.println("Enter the choice for Book");
			System.out.println("1.insert\n2.display\n3.update\n4.delete\n5.search");
			int choice=sc.nextInt();
		switch(choice)
		{
		case 1: b.insert();
		break;
		case 2:b.displayAllBooks();
		break;
		case 3:b.update(101);
		break;
		case 4:
			b.delete(101);
		break;
		case 5:b.search(101);
		default:System.out.println("Invalid operation");
		}
		
		System.out.println("Do you want continue");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		
		

	}


}
