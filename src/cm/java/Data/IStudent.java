package cm.java.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;

import cm.java.bean.Student;

public interface IStudent {
	public void addStudent(Student stu);//添加学生

	public boolean deleteStudent(int number);//删除学生

	public ArrayList<Student> getStudent(int number);//查找学生

	public ArrayList<Student> getAllStudent();//获取所有学生

}
