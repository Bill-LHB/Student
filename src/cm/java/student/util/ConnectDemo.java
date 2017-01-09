package cm.java.student.util;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectDemo {
	public static final String DBURL = "jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	
	
	public ConnectDemo(){
		loadDriver();
	}
	
	/**
	 * 加载数据库驱动
	 */
	private void loadDriver(){
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			
		}
	}
	/**
	 * 连接数据库
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static Connection getConnection() {
		Connection ction = null;
		try {
			ction = (Connection) DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ction;
	}
	/**
	 * 关闭数据库
	 * @param ction
	 */
	public static void closeConnection(Connection ction){
		try {
			if(ction!=null)
				ction.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 关闭SQL预处理
	 * @param ps
	 */
	public static void closePreparedStatement(PreparedStatement ps){
		try {
			if(ps!=null)
				ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 关闭结果集
	 * @param rs
	 */
	public static void closeResultSet(ResultSet rs){
		try {
			if(rs!=null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
