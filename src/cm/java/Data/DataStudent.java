package cm.java.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import cm.java.bean.Student;
import cm.java.student.util.ConnectDemo;

public class DataStudent extends ConnectDemo implements IStudent {
	private static DataStudent dataStudent = null;

	/**
	 * 运用单例模式
	 * 
	 * @return
	 */
	public static DataStudent getInstance() {
		if (dataStudent == null)
			dataStudent = new DataStudent();
		return dataStudent;
	}

	private DataStudent() {
	}

	/**
	 * 添加学生
	 */
	public void addStudent(Student stu) {
		String sql = "insert into Student(name,number) values(?,?)";
		PreparedStatement ps = null;
		Connection ction = null;
		try {
			ction = ConnectDemo.getConnection();
			ps = ction.prepareStatement(sql);
			ps.setString(1, stu.getName());
			ps.setInt(2, stu.getNumber());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDemo.closePreparedStatement(ps);
			ConnectDemo.closeConnection(ction);
			;
		}
	}

	/**
	 * 删除学生
	 */
	@Override
	public boolean deleteStudent(int number) {
		String sql = "delete from Student where number=?";
		PreparedStatement ps = null;
		Connection ction = null;
		try {
			ction = ConnectDemo.getConnection();
			ps = ction.prepareStatement(sql);
			ps.setInt(1, number);
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDemo.closePreparedStatement(ps);
			ConnectDemo.closeConnection(ction);
		}
		return false;
	}

	/**
	 * 查找学生
	 */
	@Override
	public ArrayList<Student> getStudent(int number) {
		String sql = "delete from Student where number=?";
		PreparedStatement ps = null;
		Connection ction = null;
		ResultSet rs = null;
		ArrayList<Student> studentList = null;
		try {
			ction = ConnectDemo.getConnection();
			ps = ction.prepareStatement(sql);
			ps.setInt(1, number);
			rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int num = rs.getInt("number");
				Student student = new Student(name, num);
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDemo.closeResultSet(rs);
			ConnectDemo.closePreparedStatement(ps);
			ConnectDemo.closeConnection(ction);
		}
		return studentList;
	}

	/**
	 * 获取所有学生
	 */
	@Override
	public ArrayList<Student> getAllStudent() {
		String sql = "select * from Student";
		PreparedStatement ps = null;
		Connection ction = null;
		ResultSet rs = null;
		ArrayList<Student> studentList = null;
		try {
			ction = ConnectDemo.getConnection();
			ps = ction.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int num = rs.getInt("number");
				Student student = new Student(name, num);
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectDemo.closeResultSet(rs);
			ConnectDemo.closePreparedStatement(ps);
			ConnectDemo.closeConnection(ction);
		}
		return studentList;
	}

}