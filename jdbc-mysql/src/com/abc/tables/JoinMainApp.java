package com.abc.tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.abc.tables.DbUtility;

public class JoinMainApp {

	public static void main(String[] args) throws Exception {

		Connection con = DbUtility.getConnection();
		Statement stmt = con.createStatement();

		String sql = "Select* from orders o join customers c on o.customer_id=c.customer_id";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			int id = rs.getInt("order_id") + rs.getInt("customer_id");
			String name = rs.getString("first_name") + rs.getString("last_name");
			System.out.println("ID  " + " " + id + "||" + "NAME  " + " " + name);
		}
		String sql1="select order_id,order_date, 'Active' as status from orders where order_date >= '2019-01-01' union select order_id,order_date, 'Archived' as status from orders where order_date <= '2019-01-01'";
		ResultSet rs1=stmt.executeQuery(sql1);
		
		while(rs1.next()){
			int orderId= rs1.getInt("order_id");
		 
		}
		

	}

}
