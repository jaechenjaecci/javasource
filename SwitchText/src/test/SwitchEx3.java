package test;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���. :");
		String position = k.next();
		
		switch (position) {
		case "����":
			System.out.println("700���� ���޵˴ϴ�.");
			break;
		case "����":
			System.out.println("500���� ���޵˴ϴ�.");
			break;
		default:
			System.out.println("300���� ���޵˴ϴ�.");
			break;
		}
	}

}
