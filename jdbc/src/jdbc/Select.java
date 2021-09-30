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
				System.out.println("연결되었습니다.");
				
				//sql구문 작성 => emp 테이블의 모든 데이터 조회
				String sql = "SELECT * FROM emp";
				
				//sql구문을 데이터베이스 서버로 전송
				pstmt = con.prepareStatement(sql);
				
				//sql구믄이 실행된 결과를 받아오기
				rs = pstmt.executeQuery(); //sql구문 실행
				//테이블 모양으로 데이터 받아옴
				
				//받아온 결과를 화면에 출력하기
				//while문 한번에 첫번째 행이 들어오고 그 다음에 각각
				//개별 컬럼에서 하나씩 데이터를 가지고 옴
				System.out.println("empno   ename   job      mgr    hiredate     sal   comm   deptne");
				
				while(rs.next()) {//resuleset 객체 안에 읽어올 내용이 있으면 true
				System.out.print(rs.getInt("empno")+"\t");
				//getNString : String이 만능이라 넣었지만 타입을 알고 있는 경우 그에
				//맞는 타입명을 일일이 설정해도 됨
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
