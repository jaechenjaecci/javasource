package com.hyndai.project;

import java.util.Scanner;

import com.samsung.project.Account;

public class AccountEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account1 = new Account("122-01-12222",10000,"��Ƹ�");
		//account1.accountNum = "122-01-12222";
		//account1.balance = 10000;
		//account1.name = "��Ƹ�";
		
		//�Ա��ϱ� - ��ȯ���� ���� ������ ȣ�⸸ ��
		account1.input(50000);
		
		//���
		System.out.println("���� �ܾ�: " + account1.output(30000));
	
	
	
	
	
	}

}
