package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) {
		// 드라이버 로드
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// 드라이버를 먼저 불어와야 함
			// 이 드라이버로 db랑 연결할거라는 뜻

			// 연결 시도, localhost는 본인컴퓨터를 의미함
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##scott";
			String password = "tiger";

		con = DriverManager.getConnection(url, user, password);
		
		if(con!=null) {
			//con이 null이 아니라면 메시지를 띄어라
			System.out.println("연결되었습니다.");
		}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
