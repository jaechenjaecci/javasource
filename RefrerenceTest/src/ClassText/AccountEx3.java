
package ClassText;

public class AccountEx3 {
   public static void main(String[] args) {
      Account3 accArr[] = new Account3[5];

      accArr[0] = new Account3("122-12", 25000, "ȫ�浿");
      accArr[1] = new Account3("122-13", 26000, "��浿");
      accArr[2] = new Account3("122-14", 27000, "��浿");
      accArr[3] = new Account3("122-15", 28000, "�ֱ浿");
      accArr[4] = new Account3("122-16", 29000, "�̱浿");

      // Ŭ���� �迭 ���� for���� �̿��ؼ� ���������� ���� �� �ִ�.
      // ���1
      for (int i = 0; i < accArr.length; i++) {
         //   System.out.println(accArr[i]); // �ּҰ� ���

         System.out.print(accArr[i].getName() + "\t");
         System.out.print(accArr[i].getBalance() + "\t");
         System.out.println(accArr[i].getAccountNum());
      }
      
      System.out.println();
      
      // ���2
      for (int i = 0; i < accArr.length; i++) {
         Account3 account = accArr[i];
         /*
          * account�� accArr[]�� �ּҰ� ���� �Ǳ� ������ 
          * accArr[0]�� account�� ����Ű�� �ּҰ� ��������
          * ���1�� ������ ����� ��µȴ�
          */
         // �Ա�
         account.input(10000);
         
         System.out.print(account.getName()+"\t");
         System.out.print(account.getBalance()+"\t");
         System.out.println(account.getAccountNum());
      }
      
      System.out.println();
      
      // ���3
      accountPrint(accArr); // �޼ҵ� ȣ��
      
      System.out.println();
      
      // ���3
      for (int i = 0; i < accArr.length; i++) {
         Account3 account = accArr[i];
         // �Ա�
         account.input(10000);
         
         accountPrint(account); 
         // ���2�� �ִ� ��¹� ��ſ� �ܺο� ������ �޼ҵ� ȣ��
      }
   }
   // ���3
   // �̷��� ��¹��� ������ �޼ҵ�� ���� �� �ִ�.
   static void accountPrint(Account3 accArr[]) {
      for (int i = 0; i < accArr.length; i++) {
         System.out.print(accArr[i].getName() + "\t");
         System.out.print(accArr[i].getBalance() + "\t");
         System.out.println(accArr[i].getAccountNum());
      }
   }
   
   // ���4
   static void accountPrint(Account3 account) { // �����ε��� �Ͼ��
      System.out.print(account.getName()+"\t");
      System.out.print(account.getBalance()+"\t");
      System.out.println(account.getAccountNum());
   }
}