package dome;

//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

//public class stu1 {
	/*
	 * JDBCӦ�ó���Ŀ������裺
	 * 1.��������
	 * 2.��������
	 * 3.����Statement����---���ع���
	 * 4.����SQL��䣬ͨ�����ع��߷��͸�DBMSִ�У�
	 * ��ͨ�����ع��߽�SQL����ִ�н�����ص�Ӧ�ó���
	 * 5.����SQL����ִ�н��
	 * 6.�ر����ӵȶ���
	 */
/*
	public static void stu(String[] args) {
		try{
			String userName="root";
			String password="admin";
			String url="jdbc:mysql://localhost:3306/stugoods";
			Class.forName("com.mysql.jdbc.Driver");//��������
			Connection conn=DriverManager.getConnection(url,userName,password);//��������
			
			  Statement stmt=conn.createStatement();//����Statement���� String
			  String sql="select * from goods"; ResultSet rs=stmt.executeQuery(sql);
			  while(rs.next()){//�α�����һ�� System.out.print(rs.getString("GoodsNO")+"-----");
			  System.out.print(rs.getString(2)+"-----");
			  System.out.println(rs.getInt("GoodsQuantity")); } rs.close(); stmt.close();
			 
			conn.close();
			
		}catch(ClassNotFoundException cnfe){
			System.out.println("��������ʧ�ܣ�");
		} catch(SQLException e){ System.out.println("����ʧ�ܣ�"); }
			 
		System.out.println("success");
	}
	*/
	
public class stu {
	public static void main(String[] args) {
	addInfo();
	}
	
	@SuppressWarnings("resource")
	static void addInfo() {
		try {
			String userName = "root" ;
			String password = "admin";
			String url = "jdbc:mysql://localhost:3306/dbgoods";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, userName, password);
			Statement stmt =conn. createStatement() ;
			Scanner sc=new Scanner(System. in);
			System . out . println("�����������Ϣ����ʽ���£�A004 computer 30");
			String gno=sc.next();
			String gname=sc. next();
			int gquantity=sc .nextInt();
			String sql = "insert into goods values('"+gno+"','"+gname+"',"+gquantity+")";
			int i= -1;
			i=stmt.executeUpdate(sql);
			if(i>0) {
				System. out. println("������ӳɹ���");
			}
			}catch(ClassNotFoundException ce) {
			 System.out.println("��������ʧ�ܣ�");
			 }catch (SQLException e) {
				 System. out . println("����ʧ�ܣ�");}	
			 }
}


