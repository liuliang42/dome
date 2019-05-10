package dome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.ResultSet;

class testfile {
	public static void main(String[] args) {
		try{
			String userName="root";
			String password="admin";
			String url="jdbc:mysql://localhost:3306/stugoods";
			Class.forName("com.mysql.jdbc.Driver");//加载驱动
			Connection conn=DriverManager.getConnection(url,userName,password);//创建连接
			
			  java.sql.Statement stmt=conn.createStatement();//创建Statement对象 String
			  String sql="select * from goods"; ResultSet rs=(ResultSet) stmt.executeQuery(sql);
			  while(rs.next()){//游标下移一行 System.out.print(rs.getString("GoodsNO")+"-----");
			  System.out.print(rs.getString(2)+"-----");
			  System.out.println(rs.getInt("GoodsQuantity")); } rs.close(); stmt.close();
			 
			conn.close();
			
		}catch(ClassNotFoundException cnfe){
			System.out.println("驱动加载失败！");
		} catch(SQLException e){ System.out.println("连接失败！"); }
			 
		System.out.println("success");
	}
}
