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
	 * JDBC应用程序的开发步骤：
	 * 1.加载驱动
	 * 2.创建连接
	 * 3.创建Statement对象---运载工具
	 * 4.定义SQL语句，通过运载工具发送给DBMS执行，
	 * 并通过运载工具将SQL语句的执行结果传回到应用程序
	 * 5.处理SQL语句的执行结果
	 * 6.关闭连接等对象
	 */
/*
	public static void stu(String[] args) {
		try{
			String userName="root";
			String password="admin";
			String url="jdbc:mysql://localhost:3306/stugoods";
			Class.forName("com.mysql.jdbc.Driver");//加载驱动
			Connection conn=DriverManager.getConnection(url,userName,password);//创建连接
			
			  Statement stmt=conn.createStatement();//创建Statement对象 String
			  String sql="select * from goods"; ResultSet rs=stmt.executeQuery(sql);
			  while(rs.next()){//游标下移一行 System.out.print(rs.getString("GoodsNO")+"-----");
			  System.out.print(rs.getString(2)+"-----");
			  System.out.println(rs.getInt("GoodsQuantity")); } rs.close(); stmt.close();
			 
			conn.close();
			
		}catch(ClassNotFoundException cnfe){
			System.out.println("驱动加载失败！");
		} catch(SQLException e){ System.out.println("连接失败！"); }
			 
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
			System . out . println("请输入货物信息，格式如下：A004 computer 30");
			String gno=sc.next();
			String gname=sc. next();
			int gquantity=sc .nextInt();
			String sql = "insert into goods values('"+gno+"','"+gname+"',"+gquantity+")";
			int i= -1;
			i=stmt.executeUpdate(sql);
			if(i>0) {
				System. out. println("货物添加成功！");
			}
			}catch(ClassNotFoundException ce) {
			 System.out.println("驱动加载失败！");
			 }catch (SQLException e) {
				 System. out . println("连接失败！");}	
			 }
}


