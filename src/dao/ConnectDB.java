package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	public Connection getConnection(){
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			String url ="jdbc:jtds:sqlserver://localhost:1433/STRUTS";
			Connection conn = DriverManager.getConnection(url,"sa","Abc12345");
			System.out.println("connect");
			return conn;
			}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("connect"+ e);
		}
		return null;
	}
	public static void main(String[] args) {
		ConnectDB cb = new ConnectDB();
		cb.getConnection();
	}
}
