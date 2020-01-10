package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "ca";
	private static final String PASSWORD = "ca";
	
	public MemberDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void create(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into member values (?, ?, ?, ?)";
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
