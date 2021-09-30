package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Select {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";

			con = DriverManager.getConnection(url, user, password);
			if (con != null) {
				System.out.println("����Ǿ����ϴ�.");
				
				//sql���� �ۼ� => emp ���̺��� ��� ������ ��ȸ
				String sql = "SELECT * FROM emp";
				
				//sql������ �����ͺ��̽� ������ ����
				pstmt = con.prepareStatement(sql);
				
				//sql������ ����� ����� �޾ƿ���
				rs = pstmt.executeQuery(); //sql���� ����
				//���̺� ������� ������ �޾ƿ�
				
				//�޾ƿ� ����� ȭ�鿡 ����ϱ�
				//while�� �ѹ��� ù��° ���� ������ �� ������ ����
				//���� �÷����� �ϳ��� �����͸� ������ ��
				System.out.println("empno   ename   job      mgr    hiredate     sal   comm   deptne");
				
				while(rs.next()) {//resuleset ��ü �ȿ� �о�� ������ ������ true
				System.out.print(rs.getInt("empno")+"\t");
				//getNString : String�� �����̶� �־����� Ÿ���� �˰� �ִ� ��� �׿�
				//�´� Ÿ�Ը��� ������ �����ص� ��
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");//Date type
				System.out.print(rs.getInt("sal")+"\t");
				System.out.print(rs.getInt("comm")+"\t");
				System.out.println(rs.getInt("deptno"));
				}
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
