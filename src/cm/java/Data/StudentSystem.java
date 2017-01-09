package cm.java.Data;

public class StudentSystem {
	private static DataStudent dataStudent = null;
	StudentSystem (){
		dataStudent=DataStudent.getInstance();
	}
}
