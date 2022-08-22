package com.AdminPage.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try(Connection con =
				DriverManager.getConnection(
						"jdbc:mariadb://localhost:3306/ks?serverTimezone=Asia.Seoul",
						"ak",
						"1234")){
			System.out.println(con);
		}catch(Exception e) {
			fail(e.getMessage());
		}
		
	}
}
