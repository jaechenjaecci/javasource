package exan;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class BankApplication {
	// 메인 안쪽이 아니라 클래스 안쪽에 바로 선언함
	// - accountArra와 Scanner를 어느곳에서도 부를 수 있게 하려고
	// - 멤버 변수로 선언한 것
	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 계좌생성작업
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

//계좌 생성
	private static void createAccount() {
// 1. 배열이 비어 있는 지 확인
// 2. 비어 있다면 사용자의 입력값을 기반으로 객체를 생성,
//    비어있는 배열의 담기
// 3. 계좌번호, 계좌주, 잔액을 사용자에게 받기

		System.out.print("계좌번호룰 입력하세요 : ");
		String ano = scanner.next();
		System.out.print("이름을 입력하세요.: ");
		String owner = scanner.next();
		System.out.print("잔액을 입력하세요.: ");
		int balance = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			// 100번 돌아감
			if (accountArray[i] == null) {
				// 배열이 비어있다면
				accountArray[0] = new Account(ano, owner, balance);
				// 입력해라
				System.out.println("계좌가 생성되었습니다.");
				break;
			}

		}
	}

//계좌 목록 보기
//accountarray가 null이 아닌 부분만 출력
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\t\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());
			}
		}
	}
//예금하기
//findAccount 호출해서 이용

	private static void deposit() {
//입금한 계좌번호 입력 받기
		System.out.print("입금할 계좌번호를 입력하세요 : ");
		String ano = scanner.next();
//입력 받은 계좌를 현재 저장되어있는 계좌에서 찾기	
		Account account = findAccount(ano);
		// 입금액 입력
		if (account != null) {
			System.out.print("입금액 : ");
			int amount = scanner.nextInt();
			//원래 잔액을 불러와서 거기에 입금액을 더한 후 다시 셋팅
			//setBalcece는 그냥 파일에서 입금액을 받은 후 balance의 값을
			//다시 설정해줌
			account.setBalance(account.getBalance() + amount);
		} else {
			System.out.println("입금 계좌를 확인해주세요.");
		}
	}

//출금하기
//findAccount 호출해서 이용
	private static void withdraw() {
		System.out.print("출금할 계좌번호를 입력하세요 : ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		// 입금액 입력
		if (account != null) {
			System.out.print("출금액 : ");
			int amount = scanner.nextInt();
			account.setBalance(account.getBalance() - amount);
		} else {
			System.out.println("출금 계좌를 확인해주세요.");
		}
	}

// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		// 입력 받은 상태
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			// 100개가 다 안채워졌을 수 도 있으니까 널이 아니라면
			if (accountArray[i] != null) {
				// 가져온게 같다면, 참조변수니까 equals 사용
				if (ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];
					break;
				}
			}

		}

		return account;
	}

}
