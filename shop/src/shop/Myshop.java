package shop;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Myshop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String selUser;

	// 장바구니
	private Product[] carts = new Product[10];

	// 회원 정보 배열 - 회원이름, 결제타입
	private User users[] = new User[2];

	// 상품 정보 배열 - 상품이름, 가격, 상세정보
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// 배열안이 null로 차있기 때문에 거기에 데이터를 입력하는 과정
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);

	}

	@Override
	public void genProduct() {
		products[0] = new SmartTv("스마트TV", 500000, "4K");
		products[1] = new SmartTv("지니TV", 600000, "4K");
		products[2] = new CellPhone("갤럭시", 200000, "SKT");
		products[3] = new CellPhone("아이폰", 400000, "KT");
		products[4] = new CellPhone("갤럭시노트", 300000, "LGUplus");

	}

	@Override
	public void start() {

		System.out.println(title + " : 메인 화면 - 계정 선택");
		System.out.println("========================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] 종료");
		System.out.print("선택 : ");
		String input = sc.next();
		System.out.println("###" + input + " 선택  ###");

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
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("========================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetail();

		}

		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
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
		System.out.println(title + "체크아웃");
		System.out.println("=======================");
		int total = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d)\n", i, carts[i].getPname(), carts[i].getPrice());
				total += carts[i].getPrice();
			}
		}
		System.out.println("결제방법 : " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : " + total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");
		String input = sc.next();

		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다. 종료합니다.");
			break;
		default:
			break;
		}

	}

}
