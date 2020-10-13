package com.hsbc;

import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.util.DBUtility;

public class SpringApproach {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DBUtility dbUtility = (DBUtility)context.getBean("dbConfig");
		System.out.println("URL: "+dbUtility.getUrl());
		System.out.println("Username: "+dbUtility.getUsername());
		System.out.println("Password: "+dbUtility.getPassword());
		System.out.println("Driver Class: "+dbUtility.getDriverClass());
		
		try {
			Class.forName(dbUtility.getDriverClass());
			Connection connection = DriverManager.getConnection(dbUtility.getUrl(), dbUtility.getUsername(), dbUtility.getPassword());
			String query = "insert into emp values('Alex', 35000)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			int count = preparedStatement.executeUpdate();
			System.out.println("Count: "+count);
			preparedStatement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
