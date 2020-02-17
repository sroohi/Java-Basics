package com.abc.tables;

import java.sql.Connection;
import java.sql.Statement;

import com.abc.tables.DbUtility;

public class AlterMainApp {
	public static void main(String[] args) throws Exception {

		Connection con = DbUtility.getConnection();

		Statement stmt = con.createStatement();

		String sql = "ALTER TABLE customers CHANGE COLUMN phone phone_no VARCHAR(50) NULL DEFAULT NULL";
		stmt.executeUpdate(sql);
	}

}
