package com.hyndai.project;

import java.util.Scanner;

import com.samsung.project.Account;

public class AccountEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account1 = new Account("122-01-12222",10000,"김아름");
		//account1.accountNum = "122-01-12222";
		//account1.balance = 10000;
		//account1.name = "김아름";
		
		//입금하기 - 반환값이 없기 때문에 호출만 함
		account1.input(50000);
		
		//출금
		System.out.println("현재 잔액: " + account1.output(30000));
	
	
	
	
	
	}

}
