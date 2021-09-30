package shop;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Myshop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// ��ٱ���
	private Product[] carts = new Product[10];

	// ȸ�� ���� �迭 - ȸ���̸�, ����Ÿ��
	private User users[] = new User[2];

	// ��ǰ ���� �迭 - ��ǰ�̸�, ����, ������
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// �迭���� null�� ���ֱ� ������ �ű⿡ �����͸� �Է��ϴ� ����
		users[0] = new User("ȫ�浿", PayType.CARD);
		users[1] = new User("������", PayType.CASH);

	}

	@Override
	public void genProduct() {
		products[0] = new SmartTv("����ƮTV", 500000, "4K");
		products[1] = new SmartTv("����TV", 600000, "4K");
		products[2] = new CellPhone("������", 200000, "SKT");
		products[3] = new CellPhone("������", 400000, "KT");
		products[4] = new CellPhone("�����ó�Ʈ", 300000, "LGUplus");

	}

	@Override
	public void start() {

		System.out.println(title + " : ���� ȭ�� - ���� ����");
		System.out.println("========================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] ����");
		System.out.print("���� : ");
		String input = sc.next();
		System.out.println("###" + input + " ����  ###");

		switch (input) {
		case "x":
			System.exit(0);
			break;

		default:
			selUser = input;
			productList();
			break;
		}

	}

	public void productList() {
		System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
		System.out.println("========================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();

		}

		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.print("���� : ");
		String input = sc.next();

		switch (input) {
		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break;
				}
			}
			productList();

			break;
		}

	}

	public void checkOut() {
		System.out.println(title + "üũ�ƿ�");
		System.out.println("=======================");
		int total = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d)\n", i, carts[i].getPname(), carts[i].getPrice());
				total += carts[i].getPrice();
			}
		}
		System.out.println("������� : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("�հ� : " + total);
		System.out.println("[p] ����, [q] �����Ϸ�");
		System.out.println("���� : ");
		String input = sc.next();

		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("������ �Ϸ�Ǿ����ϴ�. �����մϴ�.");
			break;
		default:
			break;
		}

	}

}
