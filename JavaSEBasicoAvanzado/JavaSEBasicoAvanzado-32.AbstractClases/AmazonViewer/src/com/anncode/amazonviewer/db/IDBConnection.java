package com.anncode.amazonviewer.db;

import static com.anncode.amazonviewer.db.DataBase.*;

import java.sql.Connection;
import java.sql.DriverManager;

public interface IDBConnection {
	
	default Connection connectToDB() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			if (connection != null) {
				System.out.println("Se estableci� la conexi�n :)");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			return connection;
		}
	}

}
