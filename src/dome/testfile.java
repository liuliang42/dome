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
			Class.forName("com.mysql.jdbc.Driver");//��������
			Connection conn=DriverManager.getConnection(url,userName,password);//��������
			
			  java.sql.Statement stmt=conn.createStatement();//����Statement���� String
			  String sql="select * from goods"; ResultSet rs=(ResultSet) stmt.executeQuery(sql);
			  while(rs.next()){//�α�����һ�� System.out.print(rs.getString("GoodsNO")+"-----");
			  System.out.print(rs.getString(2)+"-----");
			  System.out.println(rs.getInt("GoodsQuantity")); } rs.close(); stmt.close();
			 
			conn.close();
			
		}catch(ClassNotFoundException cnfe){
			System.out.println("��������ʧ�ܣ�");
		} catch(SQLException e){ System.out.println("����ʧ�ܣ�"); }
			 
		System.out.println("success");
	}
}
