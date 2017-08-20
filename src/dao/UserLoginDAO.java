package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserLoginDAO {
	public boolean authenticate (String UserId, String Password){
		ConnectDB connectDB= new ConnectDB();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn=connectDB.getConnection();
			String sql=" SELECT *FROM LOGIN WHERE USERID=? AND PASSWORD=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, UserId);
			ps.setString(2, Password);
			
			rs=ps.executeQuery();
			if(rs.next()){
				return true;
			}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					ps.close();
					conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		return false;
}
	public static void main(String[] args) {
		UserLoginDAO us = new UserLoginDAO();
		System.out.println(us.authenticate("chanh", "123"));
	}
}