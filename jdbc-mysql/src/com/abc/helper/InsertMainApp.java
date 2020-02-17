package com.abc.helper;

import java.sql.Connection;
import java.sql.Statement;

public class InsertMainApp {
	public static void main(String[] args) throws Exception {

		Connection con = DbUtility.getConnection();

		// creating a statement
		Statement stmt = con.createStatement();

		String sql = "insert into drivers values(2020,'shaaawn','rooohi',25,'male','8133333',1)";
		stmt.executeUpdate(sql);
	}

}
