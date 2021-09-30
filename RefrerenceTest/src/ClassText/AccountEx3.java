
package ClassText;

public class AccountEx3 {
   public static void main(String[] args) {
      Account3 accArr[] = new Account3[5];

      accArr[0] = new Account3("122-12", 25000, "홍길동");
      accArr[1] = new Account3("122-13", 26000, "장길동");
      accArr[2] = new Account3("122-14", 27000, "김길동");
      accArr[3] = new Account3("122-15", 28000, "최길동");
      accArr[4] = new Account3("122-16", 29000, "이길동");

      // 클래스 배열 또한 for문을 이용해서 순차적으로 꺼낼 수 있다.
      // 방법1
      for (int i = 0; i < accArr.length; i++) {
         //   System.out.println(accArr[i]); // 주소값 출력

         System.out.print(accArr[i].getName() + "\t");
         System.out.print(accArr[i].getBalance() + "\t");
         System.out.println(accArr[i].getAccountNum());
      }
      
      System.out.println();
      
      // 방법2
      for (int i = 0; i < accArr.length; i++) {
         Account3 account = accArr[i];
         /*
          * account에 accArr[]의 주소가 저장 되기 때문에 
          * accArr[0]과 account가 가르키는 주소가 같아져서
          * 방법1과 동일한 결과가 출력된다
          */
         // 입금
         account.input(10000);
         
         System.out.print(account.getName()+"\t");
         System.out.print(account.getBalance()+"\t");
         System.out.println(account.getAccountNum());
      }
      
      System.out.println();
      
      // 방법3
      accountPrint(accArr); // 메소드 호출
      
      System.out.println();
      
      // 방법3
      for (int i = 0; i < accArr.length; i++) {
         Account3 account = accArr[i];
         // 입금
         account.input(10000);
         
         accountPrint(account); 
         // 방법2에 있던 출력문 대신에 외부에 정의한 메소드 호출
      }
   }
   // 방법3
   // 이렇게 출력문만 별도의 메소드로 만들 수 있다.
   static void accountPrint(Account3 accArr[]) {
      for (int i = 0; i < accArr.length; i++) {
         System.out.print(accArr[i].getName() + "\t");
         System.out.print(accArr[i].getBalance() + "\t");
         System.out.println(accArr[i].getAccountNum());
      }
   }
   
   // 방법4
   static void accountPrint(Account3 account) { // 오버로딩이 일어났다
      System.out.print(account.getName()+"\t");
      System.out.print(account.getBalance()+"\t");
      System.out.println(account.getAccountNum());
   }
}