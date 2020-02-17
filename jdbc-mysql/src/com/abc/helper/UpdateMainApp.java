package com.abc.helper;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateMainApp {
	public static void main(String[] args) throws Exception {

		Connection con = DbUtility.getConnection();

		// creating a statement
		Statement stmt = con.createStatement();

		String sql = "update drivers set address = '5848494 skjhshf' where driver_id=2020";
		stmt.executeUpdate(sql);
	}
}
